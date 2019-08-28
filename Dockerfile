FROM hseeberger/scala-sbt:8u212_1.2.8_2.12.9
WORKDIR /opt/load-test
#below 3 steps to speed up build
COPY ./build.sbt .
COPY ./project ./project
RUN sbt update

COPY . .
CMD ["sbt", "gatling:test"]