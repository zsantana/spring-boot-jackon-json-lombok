# Test Performance Process Json with Jackon and Lombok

A service using Rest API in Java (Spring Boot)

<br>

## Endpoint /api/book/v1
Using serialized RECORD.


## Endpoint /api/book/v2
Using Lombok.


## Endpoint /api/book/v3
Using String with Jackson

<br>

## 💻 Getting started

```bash
# Build 
$ mvn clean package

# Local execution
$ mvn spring-boot:run

# Run Local
$ ./run.sh

# Test Run with hey
$ ./testeRun.sh
```




## ✔️ Required
* Maven: 3.8.4
* Java version: 21
* Docker version: 20.10.17
* Docker-compose version: v2.2.2


## Métricas:

With Lombok:
![image](https://github.com/zsantana/spring-boot-jackon-json-lombok/assets/17239827/8b86a835-25bb-4c0a-baf2-c75da75960fb)



without Lombok:
![image](https://github.com/zsantana/spring-boot-jackon-json-lombok/assets/17239827/605747ed-e9f7-4938-80ba-78c57fabc49d)


