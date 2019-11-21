FROM java:8
MAINTAINER walterwyn
ADD /workspace/output/spring-jsp-static-resource-0.0.1-SNAPSHOT.war app.war
EXPOSE 80
ENTRY
