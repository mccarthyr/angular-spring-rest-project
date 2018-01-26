# angular-spring-rest-project

## Quick Overview

Pre-installed Requirements: Java 1.8+, Maven, Node.js, Node Package Manager (NPM), MySQL.

### Set-up - (*requires a few initialisation commands for both the Angular and Spring-Boot side*)

Go to the directory where you want to install the project and then run the following commands:
```bash
git clone https://github.com/mccarthyr/angular-spring-rest-project
cd angular-spring-rest-project/UI
npm install
cd ../API/hero
```

From this location you need to edit the src/main/resource/application.properties file to add in your own username and password for the database connection. Once that is done then contine with the following:
```shell
mvn install
```
### Check UI and API are working - 

**UI**
Go to angular-spring-rest-project/UI and issue the command:
```shell
ng serve
```
Then in your browser go to: http://localhost:4200

**API**
Go to angular-spring-rest-project/API/hero and issue the command:
```sh
mvn spring-boot:run
```
Then in your brwoser go to: http://localhost:8080

