package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.management.*;
import java.lang.management.*;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

    InvocationCount invocationCountBean = null;

    public App() {
    }

   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

         // Get the platform MBeanServer
         invocationCountBean = new InvocationCount();
         MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
         ObjectName objectName = null;

         try {
             // Uniquely identify the MBeans and register them with the platform MBeanServer
             objectName = new ObjectName("jmx-java-app:name=InvocationCountBean");
             mbs.registerMBean(invocationCountBean, objectName);

         } catch(Exception e) {
             e.printStackTrace();
         }

      return application.sources(App.class);
   }

   public static void main(String[] args)  {
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);
   }


}
