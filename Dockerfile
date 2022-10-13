FROM maven:3.8-openjdk-17 AS builder

WORKDIR /watercontainment

COPY pom.xml /watercontainment/pom.xml

RUN mvn dependency:go-offline

COPY . /watercontainment

RUN mvn package


FROM openjdk:17.0.2

COPY --from=builder /watercontainment/target/WaterContainment-MIDDLEWARE-0.0.1-SNAPSHOT.jar /WaterContainment-MIDDLEWARE-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Xdebug","-Xrunjdwp:transport=dt_socket,server=y,address=8082,suspend=n", "-jar","-Dspring.profiles.active=docker", "/WaterContainment-MIDDLEWARE-0.0.1-SNAPSHOT.jar"]