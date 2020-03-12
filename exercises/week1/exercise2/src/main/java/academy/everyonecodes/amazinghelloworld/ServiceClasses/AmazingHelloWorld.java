package academy.everyonecodes.amazinghelloworld.ServiceClasses;

import org.springframework.stereotype.Service;

@Service
public class AmazingHelloWorld {
    private final Hello hello;
    private final World world;

    public AmazingHelloWorld(Hello hello, World world) {
        this.hello = hello;
        this.world = world;
    }

    public String get() {
        return hello.sayHello() + " " + world.sayWorld();
    }
}
