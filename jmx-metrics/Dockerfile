FROM eclipse-temurin:21.0.2_13-jre-alpine

WORKDIR /app

ADD session.properties .

# Add the latest version of the JMX Metric Gatherer
ADD https://github.com/open-telemetry/opentelemetry-java-contrib/releases/download/v1.32.0/opentelemetry-jmx-metrics.jar /opt/opentelemetry-java-contrib-jmx-metrics.jar

CMD java -jar /opt/opentelemetry-java-contrib-jmx-metrics.jar -config session.properties
