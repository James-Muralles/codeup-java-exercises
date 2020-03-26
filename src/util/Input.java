package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {

        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter a word variation of yes.");
        String Input = scanner.nextLine().toLowerCase();
        if (Input.startsWith("y")){
            return true;
        }
        else {

            return false;
        }
    }

    public int getInt (int min, int max){

        do {
            System.out.printf("Enter an int between %d - %d: ", min, max);
        int Input = scanner.nextInt();
        if (Input > max || Input < min) {
                System.out.println("not within range");
                getInt(min, max);
            } else {
                return Input;
            }
        } while (true);
    }

    public double getDouble (int min, int max){

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

    public String getDouble (double min, double max){

        do {
            System.out.printf("Enter an double between %.2f - %.2f: ", min, max);
            double Input = scanner.nextDouble();
            if (Input > max || Input < min) {
                System.out.println("not within range");
                getDouble(min, max);
            } else {
                return  String.format("%.2f", Input);
            }
        } while (true);
    }


}
