package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController
{
    @GetMapping("/")
    public String hello()
    {
      // increment the counter each time this method is invoked
        InvocationCount.incrementNumInvocations();
        return "Hello, JMX World!";
    }

}