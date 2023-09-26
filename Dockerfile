FROM openjdk:19
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/BeeOrganizedProject-0.0.1-SNAPSHOT.war
ADD ${JAR_FILE} truebeeorganizeed.jar
ENTRYPOINT ["java","-jar","/truebeeorganizeed.jar"]