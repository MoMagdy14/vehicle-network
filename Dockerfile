FROM openjdk:19-alpine
COPY target/vehicle-network-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
CMD ["java", "-jar", "vehicle-network-0.0.1-SNAPSHOT.jar"]