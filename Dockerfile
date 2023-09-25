FROM openjdk:17
VOLUME /tmp
EXPOSE 8087
ARG JAR_FILE=target/BeeOrganizedProject-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} BeeOrganizednew.jar
ENTRYPOINT ["java","-jar","/BeeOrganizednew.jar"]