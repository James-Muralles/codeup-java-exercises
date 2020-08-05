package test;

import main.Cup;
import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


public class CupTest {
//Testing to see if object gets created using
    //this test will only tell you the first error
    @Test
    public void testObjectCreation(){
        Cup newCup = new Cup("water", 75.5);
        Assert.assertEquals("water", newCup.getLiquidType());
        Assert.assertEquals(75.5, newCup.getPercentFull(), 0.001);

    }

    //using lamdba functions
    //this test will show all the errors
    @Test
    public void testObjectCreationWithAssertAll(){
        Cup newCup = new Cup("water", 75.5);
        assertAll("correctly builds object",
                () ->  Assert.assertEquals("water", newCup.getLiquidType()),
                () ->  Assert.assertEquals(75.5, newCup.getPercentFull(), 0.001)
        );
    }

    @Test
    public void testIsEmpty(){
        Cup newCup = new Cup("water", 75.5);
        Assert.assertFalse(newCup.isEmpty());
    }

 @Test
    public void getLiquidType() {

        Cup c = new Cup("Orange Juice", 85.4);
        Assert.assertEquals("Orange Juice", c.getLiquidType());
 }

 @Test
 public void testSetLiquidWithNull(){
     Cup newCup = new Cup("water", 75.5);
     newCup.setLiquidType(null);
     Assert.assertNotNull(newCup.getLiquidType());

 }

 @Disabled("Disabled until library team fixes bug")
    @Test
    public void testTestExternalLibrary(){
        //imagine someone elses code
        Assert.fail();
    }

    @Test
    public void testSetBadPercentThrows(){
        Cup newCup = new Cup("water", 75.5);
        assertThrows(IllegalArgumentException.class,
                () -> newCup.setPercentFull(-1));

    }


    @Test

    public void getPercentageFull(){
     Cup b = new Cup("Orange Juice", 85.5);
     Assert.assertEquals(85.5, b.getPercentFull(), 0.001);

 }

    @Test
    public void setLiquidType() {

        Cup b = new Cup("Orange Juice", 85.5);
        b.setLiquidType("Water");
        Assert.assertEquals("Water", b.getLiquidType());
    }


    //infinte loop until number gets close
    public double guessThePercent(Cup cup){
        while (true) {
            double guess = Math.random();
            if (Math.abs(guess - cup.getPercentFull()) < 1) {
                return guess;
            }
        }

        }


        //will timeout after 5 seconds
        @Test
                void guessThePercent(){
            Cup anotherCup = new Cup("water", 50);
            assertTimeoutPreemptively(Duration.ofSeconds(5),
                    () -> guessThePercent(anotherCup) > 0);

        }

}
