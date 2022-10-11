FROM openjdk:11
EXPOSE 8080
COPY target/demo-hello-world-docker.jar  demo-hello-world-docker.jar
ENTRYPOINT ["java","-jar","demo-hello-world-docker.jar"]
