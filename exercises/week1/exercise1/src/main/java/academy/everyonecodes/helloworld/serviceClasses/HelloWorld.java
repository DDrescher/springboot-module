package academy.everyonecodes.helloworld.serviceClasses;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {
    public String sayHelloToWorld() {
        return "Hello World";
    }
}
