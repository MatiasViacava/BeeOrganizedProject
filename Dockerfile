FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/BeeOrganizedProject-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} BeeOrganizedTets.jar
ENTRYPOINT ["java","-jar","/BeeOrganizedTets.jar"]