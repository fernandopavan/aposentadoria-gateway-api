FROM openjdk:11.0-jdk-slim

EXPOSE 8080

ARG JAR_FILE=target/aposentadoria-gateway-*.jar

WORKDIR /opt/app

COPY ${JAR_FILE} aposentadoria-gateway.jar

ENTRYPOINT ["java","-jar","aposentadoria-gateway.jar"]