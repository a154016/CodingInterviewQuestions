FROM openjdk:8
COPY /src/com/ashish/interview /src/java
WORKDIR src/java
RUN ["javac", "HelloWorld.java"]

ENTRYPOINT ["java" ,"HelloWorld"]