FROM maven:3.3.9-jdk-8

EXPOSE 8080

RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

ADD . /usr/src/app

RUN mvn install

CMD java -jar target/employees-0.0.1-SNAPSHOT.jar