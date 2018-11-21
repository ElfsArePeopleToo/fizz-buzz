## fizz-buzz

This application is a 'Fizz Buzz' game with REST api and web interface.

The rules: 
A user gives a number (or many) and expects a reply with numbers divisible by three replaced with the word "fizz" and numbers divisible by five with the word "buzz".

more information: https://en.wikipedia.org/wiki/Fizz_buzz

# Run Application

The project has two part: backend and frontend.

For build backend of application

```
maven clean install  
```
 
 For launch backend of application
 
 ```
  maven spring-boot:run
```

For frontend setup

 ```
 $npm install
```

Compiles and hot-reloads frontend for development
```
npm run serve
```

 
After you can go to a browser at http://localhost:8090.

# Technology

The backend was written in Java with Spring Boot. This is built with maven. This app can start on embedded tomcat.

The frontend was created with vueJs by vue-cli. The frontend has one UI interfaces with an input field and submit button. 
Applications are connecting through HTTP requests. 

# What can be improved

1. Adding validation on the front end part.
2. Adding popup window on the UI with respounse information.
3. Frontend tests.
4. Generate documentation.
