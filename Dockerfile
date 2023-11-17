FROM openjdk:17
EXPOSE 9090
ADD target/demo-1.jar demo-1.jar
ENTRYPOINT ["java","-jar","/demo-1.jar"]