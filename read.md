# Project boilerplate for a simple sonar config with java and docker

## SonarQube Configuration
# SonarQube is configured in the `sonar-project.properties` file.

## Docker Configuration
# Docker is configured in the `Dockerfile` and `docker-compose.yml` files.
### to run the docker container, use the following command, remember to change the variable accourding to your project:
```bash 
mvn clean verify sonar:sonar '-Dsonar.projectKey=java-local-new' '-Dsonar.host.url=http://localhost:9000' '-Dsonar.login=sqp_0efc325f3194d6205535dbe50e9af2471e1bfa0d' '-Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml'
