FROM openjdk:11
VOLUME /tmp
EXPOSE 9091 
ADD target/ms2-product-0.0.1-SNAPSHOT.jar ms2-product.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ms2-product.jar"]
