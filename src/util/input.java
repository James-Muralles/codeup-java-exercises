package util;
import java.util.Scanner;

public class input {
    private Scanner scanner;

    public input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        }
        else {
            return false;
        }
    }


}
