FROM java:openjdk-7u75

WORKDIR /work

EXPOSE 3000

RUN apt-get update && apt-get install maven -y

# install dependencies
ADD pom.xml /work/
RUN mvn install

# make logs dir
RUN mkdir -p /work/logs

# copy src
ADD . /work

# run web server on $PORT
CMD mvn test
