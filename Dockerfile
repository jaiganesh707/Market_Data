FROM openjdk:21
COPY target/StockRegister-0.0.1-SNAPSHOT.jar StockRegister-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","StockRegister-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
