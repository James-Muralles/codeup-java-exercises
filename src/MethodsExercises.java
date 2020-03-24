import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(addition(1, 5));
//        System.out.println(subtraction(1, 5));
//        System.out.println(multiply(1, 5));
//        System.out.println(divide(1, 3));
//        System.out.println(remainder(5,3));
//        System.out.println(factorial());
        System.out.println(getInteger(3, 5));
        System.out.println(diceRoll(2, 3));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;

    }


    public static float divide(float a, float b) {
        return (a / b);
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static int factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please inter an integer from 1 - 10.");
        int numberInput = input.nextInt();
        return factorial(numberInput);
    }

    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }

    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.printf("Enter an int between %d - %d:", min, max);
            int numberInput = input.nextInt();
            if (numberInput > max || numberInput < min) {
                getInteger(min, max);
            } else {
                return numberInput;

            }

        } while (true);
    }


//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter number of sides");
//            int sideInput = input.nextInt();

    public static int diceRoll(int dice1, int dice2) {
        Scanner input = new Scanner(System.in);
        int diceOne = (int) (Math.random() * 6) + 1;
        int diceTwo = (int) (Math.random() * 6) + 1;
        System.out.println("Would you like to roll? yes/no");
        String confirmation = input.nextLine();
        if (confirmation.equals("yes")) {
            return (diceOne + diceTwo);

        } else {
            return diceOne;


        }
    }


}




