# Gatling-sbt-docker

Bootstrap project for running gatling test cases with sbt on docker

## Why this bootstrap
Every time when there is need of performance test cases with Gatling: same setup mentioned in this repo needs to be performed. Though giter8 template - ([here](https://gatling.io/docs/current/extensions/giter8_template/#g8-template)) is good alternative but it doesnot not have advanced setup of project

#### Docker Image
If like me your CI agents are vanilla[without scala, java, sbt] and you want to run your test cases using docker then this docker file will help.
## How to use
Clone this project and make changes as per your project
This project uses gatling sbt plugin.   

## Building docker image  
```docker build -t perftest:v1.0 .```

## Running test case in docker container  
```docker run -v ./gatling-result:/opt/load-test/target/gatling perftest:v1.0 sbt gatling:test ```
## Running on local
```sbt gatling:test```


