FROM openjdk:11.0-jdk-slim

EXPOSE 8080

ARG JAR_FILE=target/aposentadoria-gateway-api-*.jar

WORKDIR /opt/app

COPY ${JAR_FILE} aposentadoria-gateway-api.jar

ENTRYPOINT ["java","-jar","aposentadoria-gateway-api.jar"]