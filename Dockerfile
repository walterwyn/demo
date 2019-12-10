FROM java:8
MAINTAINER walterwyn
ADD spring-jsp-static-resource-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080
CMD java -jar app.war
