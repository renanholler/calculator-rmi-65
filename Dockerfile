FROM openjdk:11-jdk-slim
WORKDIR /app
COPY ./src /app/src
RUN javac -d /app/bin /app/src/**/*.java
CMD ["echo", "Build completed"]