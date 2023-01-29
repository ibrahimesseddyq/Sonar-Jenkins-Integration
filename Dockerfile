FROM openjdk:19
WORKDIR /app
COPY target/YouBooking-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083:8083
CMD ["java","-jar","app.jar"]
