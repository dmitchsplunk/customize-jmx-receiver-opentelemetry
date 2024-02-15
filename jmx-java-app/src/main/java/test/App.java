package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.management.*;
import java.lang.management.*;

@SpringBootApplication
@RestController
public class App extends SpringBootServletInitializer {

    private MBeanServer mbs = null;
    InvocationCount invocationCountBean = null;

    public App() {

        // Get the platform MBeanServer
        mbs = ManagementFactory.getPlatformMBeanServer();
        invocationCountBean = new InvocationCount();
        ObjectName objectName = null;

        try {
            // Uniquely identify the MBeans and register them with the platform MBeanServer
            objectName = new ObjectName("jmx-java-app:name=InvocationCountBean");
            mbs.registerMBean(invocationCountBean, objectName);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(App.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(App.class, args);
   }

   @RequestMapping(value = "/")
   public String hello() {
      // increment the counter each time this method is invoked
      invocationCountBean.incrementNumInvocations();
      return "Hello, JMX World! Number of invocations is: " + invocationCountBean.getNumInvocations();
   }
}