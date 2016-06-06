FROM maven:3.3.9-jdk-8

EXPOSE 8080

RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

ADD . /usr/src/app

RUN mvn package

CMD mvn spring-boot:run