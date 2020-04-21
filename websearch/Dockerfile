FROM openjdk:11
COPY ./target/websearch-1.0-SNAPSHOT.jar /usr/src/travel-planner/websearch.jar
WORKDIR /usr/src/travel-planner
CMD ["java","-jar","./websearch.jar"]


FROM openjdk:11 AS builder
WORKDIR /usr/src/travel-planner/websearch
COPY ./target/websearch-1.0-SNAPSHOT-spring-boot.jar /usr/src/travel-planner/websearch.jar
RUN jar -xf ../websearch.jar

FROM openjdk:11
ARG BUILDER_DIR=/usr/src/travel-planner/websearch
COPY --from=builder ${BUILDER_DIR}/BOOT-INF/lib /app/lib
COPY --from=builder ${BUILDER_DIR}/META-INF /app/META-INF
COPY --from=builder ${BUILDER_DIR}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "travelplanner.websearch.WebSearchApplication"]
