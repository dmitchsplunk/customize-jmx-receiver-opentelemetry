CATALINA_OPTS="-javaagent:/usr/local/tomcat/splunk-otel-javaagent.jar -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=1099 -Dcom.sun.management.jmxremote.rmi.port=1099 -Dcom.sun.management.jmxremote.host=0.0.0.0 -Djava.rmi.server.hostname=0.0.0.0 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.local.only=false"