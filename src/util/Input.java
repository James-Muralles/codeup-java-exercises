package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;//created a property with the Scanner type named scanner

    public Input() {// created a method called input. This will construct my scanner.
        scanner = new Scanner(System.in);// created a new scanner in my scanner variable. Scanner is now an actual scanner
    }

    public String getString() {
        return scanner.nextLine();
    } //returns the input string

    public boolean yesNo() {// true or false if a variation of yes is entered
        System.out.println("Enter a word variation of yes.");
        String Input = scanner.nextLine().toLowerCase();// makes input accept lower cases and upper case
        return Input.startsWith("y");// if input starts with a y it will return true
    }

    public int getInt(int min, int max) {// return an int between a range of min and max
        System.out.printf("Enter an int between %d - %d: \n", min, max);
        String x = scanner.nextLine();// x is the input as a string
        int inputInt = Integer.parseInt(x);
        if (inputInt < max && inputInt > min) {
            return inputInt;
        } else {
            System.out.println("not within range");
            getInt(min, max);
        }
        return inputInt;
    }


    public int getInt() {
        System.out.println("Enter an integer: ");
        String x = scanner.nextLine();
        int inputInt;
        try {
            inputInt = Integer.parseInt(x);

        } catch (Exception e) {
            System.out.println("Input is not a INTEGER");
            return getInt();
        }

        return inputInt;
    }

    public double getDouble(int min, int max) {

        do {
            System.out.printf("Enter a number between %d - %d: ", min, max);
            double Input = scanner.nextDouble();
            if (Input > max || Input < min) {
                System.out.println("not within range");
                getDouble(min, max);
            } else {
                return Input;
            }
        } while (true);
    }


    public double getDouble() {
        System.out.println("Enter an number: ");
        String x = scanner.nextLine();
        double inputDouble = 0;
        while (true) {
            try {
                inputDouble = Double.parseDouble(x);
                break;

            } catch (Exception e) {
                System.out.println("Input is not a NUMBER");
                return getDouble();
            }

        }
        return inputDouble;
    }

    public String getDouble(double min, double max) {

        do {
            System.out.printf("Enter an double between %.2f - %.2f: ", min, max);
            double Input = scanner.nextDouble();
            if (Input > max || Input < min) {
                System.out.println("not within range");
                getDouble(min, max);
            } else {
                return String.format("%.2f", Input);
            }
        } while (true);
    }


}
