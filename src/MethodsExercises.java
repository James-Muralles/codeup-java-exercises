import java.util.Scanner;
import java.io.*;


public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(addition(1, 5));
//        System.out.println(subtraction(1, 5));
//        System.out.println(multiply(1, 5));
//        System.out.println(divide(1, 0));
//        System.out.println(remainder(5,3));
        System.out.println(factorial());
//        System.out.println(getInteger(3, 5));
//        System.out.println(diceRoll(2, 3));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        //        return a * b;
// TODO: 3/24/20 with loop

//        int j = 1;
//        if (a < 0) b = 0 - b;
//        int product = 0;
//        for(int i = a; i < 0; i -=j){
//            product += b;
//        }
//return product;

// TODO: 3/24/20 with recursion

        int product = 0;
        if (a > 0) {
            product = b + multiply(a - 1, b);
        } else if (a < 0) {
            product = b + multiply(a + 1, b);
        }
        return product;
    }


    public static float divide(float a, float b) {
if ( b == 0){
    throw new ArithmeticException("cant divide by zero");
}
        return (a / b);
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static long factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please inter an integer from 1 - 20.");
        Long numberInput = input.nextLong();
        return factorial(numberInput);
    }

    public static long factorial(long a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }

    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.printf("Enter an int between %d - %d: ", min, max);
            int numberInput = input.nextInt();
            if (numberInput > max || numberInput < min) {
                System.out.println("not within range");
                getInteger(min, max);
            } else {
                return numberInput;
            }
        } while (true);
    }


//            Scanner Input.java = new Scanner(System.in);
//            System.out.println("Enter number of sides");
//            int sideInput = Input.java.nextInt();

    public static String diceRoll(int dice1, int dice2) {
        Scanner input = new Scanner(System.in);
        int diceOne = (int) (Math.random() * 6) + 1;
        int diceTwo = (int) (Math.random() * 6) + 1;
        System.out.println("Would you like to roll? yes/no");
        String confirmation = input.nextLine();
        if (confirmation.equals("yes")) {
            return ("" + diceOne + diceTwo);

        } else {
            return "" + diceOne;


        }
    }




}




