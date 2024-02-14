# customize-jmx-receiver-opentelemetry

### Build a Docker image including Tomcat and a sample application 
````
cd tomcat
docker build -t tomcat-with-sample-app .
````

### Create a file named .env in the root directory with the information required to connect to Splunk Observability Cloud: 
````
SPLUNK_REALM=<i.e. us0, us1, eu0, etc>
SPLUNK_ACCESS_TOKEN=<your access token>
SPLUNK_MEMORY_TOTAL_MIB=1024
SPLUNK_LISTEN_INTERFACE=0.0.0.0
````

### Run the application locally 
````
cd ..
docker compose up
````

### Access the web application using your browser 
````
http://localhost:8080/sample
````
