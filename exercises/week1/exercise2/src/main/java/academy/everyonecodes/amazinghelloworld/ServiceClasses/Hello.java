package academy.everyonecodes.amazinghelloworld.ServiceClasses;

import org.springframework.stereotype.Service;

@Service
public class Hello {
    public String sayHello() {
        return "Hello";
    }
}
