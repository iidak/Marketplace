# Example project for Vue.js and Spring Boot

Documentation for frameworks be found from:
- https://vuejs.org/v2/guide/
- https://spring.io/guides/gs/spring-boot/

Project was created with vue-cli (https://cli.vuejs.org/) and
spring boot initializr (https://start.spring.io/).

## How to start
Build frontend environment
```
cd web
npm install
npm run serve
```

Run Spring Boot (which will also install all dependencies)
```
(from the root of example project)
./gradlew bootRun
OR IN WINDOWS
.\gradlew bootRun
```

Go to `http://localhost:9000` in browser