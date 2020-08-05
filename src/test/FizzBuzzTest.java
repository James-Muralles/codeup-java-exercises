package test;

import main.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConverterLeavesNormalNumbersAlone() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }


    @Test
    public void convertToMultiplesOfThree(){
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            Assert.assertEquals("Fizz", fizzBuzz.convert(3));

        }

    @Test
    public void convertToMultiplesOfFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

    }

    @Test
    public void convertToMultiplesOfFifteen(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));

    }




}
