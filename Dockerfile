FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/dityudha-afi-0.0.1-SNAPSHOT.jar 
ADD ${JAR_FILE} dityudha-afi.jar
ENTRYPOINT ["java","-jar","/dityudha-afi.jar"]