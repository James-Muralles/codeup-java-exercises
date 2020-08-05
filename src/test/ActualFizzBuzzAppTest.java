package test;

import main.FizzBuzzConverter;
import org.junit.Test;

public class ActualFizzBuzzAppTest {

    @Test
    public void outputHundredFizzBuzz(){
       FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for(int i = 1; i <= 100; i++){
            System.out.println(fizzBuzz.convert(i));

        }

    }
}
