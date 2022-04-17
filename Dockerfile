FROM openjdk:8
COPY ./target/calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]
