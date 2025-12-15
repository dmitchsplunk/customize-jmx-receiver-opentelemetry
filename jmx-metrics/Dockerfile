FROM eclipse-temurin:21.0.2_13-jre-alpine

WORKDIR /app

ADD session.properties .
ADD jmx-metrics-config.yaml .

# Add the latest version of the JMX Metric Scraper
ADD https://github.com/open-telemetry/opentelemetry-java-contrib/releases/download/v1.52.0/opentelemetry-jmx-scraper.jar /opt/opentelemetry-jmx-scraper.jar

CMD java --add-exports java.security.sasl/com.sun.security.sasl=ALL-UNNAMED -jar /opt/opentelemetry-jmx-scraper.jar -config session.properties
