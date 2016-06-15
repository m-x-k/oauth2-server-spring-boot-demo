FROM java:8

RUN mkdir /app

ADD build/libs/authServer-0.1.0.jar /app/

CMD ["java", "-jar", "/app/authServer-0.1.0.jar"]
