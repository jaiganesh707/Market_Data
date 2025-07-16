FROM openjdk:21
COPY target/StockRegister-0.0.1-SNAPSHOT.jar StockRegister-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","StockRegister-0.0.1-SNAPSHOT.jar.jar"]
EXPOSE 8080
