FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/BeeOrganizedProject-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} beeorganizedbacknew.jar
ENTRYPOINT ["java","-jar","/beeorganizedbacknew.jar"]