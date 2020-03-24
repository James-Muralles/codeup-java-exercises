import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
// TODO: 3/20/20 Prompt a user to enter a integer and store that value in an int variable using the nextInt method.What happens if you input something that is not an integer? 
        
        //        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        System.out.println("Enter an integer.");
//        int number = input.nextInt();
//        System.out.println(int);

// TODO: 3/20/20 Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline. What happens if you enter less than 3 words? What happens if you enter more than 3 words?

//        System.out.println("Enter 3 words.");
//        String wordOne = input.next();
//        String wordTwo = input.next();
//        String wordThree = input.next();
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

// TODO: 3/20/20 Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. Do you capture all of the words?

//        System.out.println("Enter a sentence.");
//
//        String sentence = input.next();
//
//        System.out.println(sentence);


// TODO: 3/20/20 Rewrite the above example using the nextLine method.

//        System.out.println("Enter a sentence.");
//
//        String sentence = input.nextLine();
//
//        System.out.println(sentence);

// TODO: 3/20/20 Calculate the perimeter and area of Codeup's classrooms. Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type. Assume that the rooms are perfect rectangles. Assume that the user will enter valid numeric data for length and width.

        /*this is how I did it without parse, individual inputs for length and width*/

//        System.out.println("Enter the length of the Rectangle:");
//        float length= input.nextFloat();
//        System.out.println("Enter the width of the Rectangle:");
//        float width= input.nextFloat();
//        float  perimeter = 2 * (length + width);
//        System.out.printf("Perimeter: %.2f ", perimeter);


        /*the other way I did it*/
//        double l, w, h,  Area, Perimeter, Volume;
//        System.out.println("\n Please Enter length and width and volume: ");
//        l = input.nextDouble();
//        w = input.nextDouble();
//        h = input.nextDouble();
//        Perimeter = 2*(l +w);
//        Area = l * w;
//        Volume = l * w * h;
//
//        System.out.printf("\nThe perimeter is = %.2f\nThe area is = %.2f\n The volume is = %.2f ", Perimeter, Area, Volume);
//
//        System.out.println("Please enter a length");
//        int length= Integer.parseInt(input.nextLine());
//
//        System.out.println("Please enter width");
//        int width= Integer.parseInt(input.nextLine());
//
//        int area = length * width;
//        int perimeter = (2*length)+ (2*width);
//




    }
}
