FROM openjdk:11 AS builder
WORKDIR /usr/src/travel-planner/keywords
COPY ./target/keyword-generator-1.0-SNAPSHOT-spring-boot.jar /usr/src/travel-planner/keywords.jar
RUN jar -xf ../keywords.jar

FROM openjdk:11
ARG BUILDER_DIR=/usr/src/travel-planner/keywords
COPY --from=builder ${BUILDER_DIR}/BOOT-INF/lib /app/lib
COPY --from=builder ${BUILDER_DIR}/META-INF /app/META-INF
COPY --from=builder ${BUILDER_DIR}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "travelplanner.keywords.KeyWordsApplication"]
