FROM tomcat:jre21

# Add the latest version of the Splunk Java agent
ADD https://github.com/signalfx/splunk-otel-java/releases/latest/download/splunk-otel-javaagent.jar .

# Add the sample app to our Tomcat server
ADD sample.war /usr/local/tomcat/webapps/

# Ensure JMX is enabled in Tomcat and it references splunk-otel-javaagent.jar on startup
ADD setenv.sh /usr/local/tomcat/bin/

EXPOSE 8080

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
