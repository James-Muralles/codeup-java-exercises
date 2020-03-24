import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Me: ");
            String questionYell = input.nextLine();
            if (questionYell.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (questionYell.endsWith("!")) {
                System.out.println("Bob: Whoa chill out!");
            } else if (questionYell.equals("")) {
                System.out.println("Bob: Fine. Be that way!");
                break;
            } else if (questionYell.equalsIgnoreCase("I'm done with you")) {
                break;
            } else if (questionYell.equalsIgnoreCase("I hate you")) {
                System.out.println("Bob: I hope you get corona!");
                break;

            } else {
                System.out.println("Bob: Whatever");
            }
        }
        while(true);


    }
}
