FROM openjdk:11
VOLUME /tmp
EXPOSE 9192
ADD target/ms1-user-0.0.1-SNAPSHOT.jar ms1-user.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ms1-user.jar"]