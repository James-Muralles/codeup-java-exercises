package test;

import main.Greeting;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void helloWorld(){
        Greeting greeting = new Greeting();



        Assert.assertEquals( "Hello World!", greeting.getMessage());


    }
}
