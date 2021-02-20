FROM openjdk:11

ARG JAR_FILE=springbootauth0postgres-0.0.1-SNAPSHOT.jar
RUN mkdir /app

COPY target/${JAR_FILE} /app/${JAR_FILE}
RUN mv /app/${JAR_FILE} /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]