package academy.everyonecodes.helloworld.serviceClasses;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HelloWorldTest {
@Autowired
    HelloWorld helloWorld;
    @Test
    void sayHelloToWorld() {
        String result = helloWorld.sayHelloToWorld();
        String expected = "Hello World";
        assertEquals(expected,result);
    }
}