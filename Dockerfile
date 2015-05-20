FROM maven:3.3-jdk-7

WORKDIR /work

EXPOSE 3000

# install dependencies
ADD pom.xml /work/
RUN mvn install

# make logs dir
RUN mkdir -p /work/logs

# copy src
ADD . /work

# run web server on $PORT
CMD exec java -jar target/java-test-0.0.1.jar
