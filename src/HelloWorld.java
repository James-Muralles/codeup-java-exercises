public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(" World!\n");
        // TODO: 3/19/20   Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 12;
//        System.out.println(myFavoriteNumber);

// TODO: 3/19/20   a String variable named myString and assign a string value to it, then print the variable out to the console.

//        String myString = "Tom Brady";
//        System.out.println(myString);
//
// TODO: 3/19/20  Change your code to assign a character value to myString. What do you notice?

//        myString = 'c';
//        System.out.print(myString); // string cannot be converted to char

// TODO: 3/19/20 Change your code to assign the value 3.14159 to myString. What happens?

//        String myString = 3.14159;
//        System.out.print(myString); //double cannot be converted to string
//
// TODO: 3/19/20  Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//        long myNumber;
//        System.out.print(myNumber); //variable not initialized

// TODO: 3/19/20   Change your code to assign the value 3.14 to myNumber. What do you notice?

//        long myNumber = 3.14;
//        System.out.print(myNumber); // lossy conversion from double to long

// TODO: 3/19/20  Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        long myNumber = 123L;
//        System.out.print(myNumber);
/// TODO: 3/19/20   your code to assign the value 123 to myNumber.

//        long myNumber = 123;
//        System.out.print(myNumber);
//
// TODO: 3/19/20   does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
// TODO: 3/19/20  Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        float myNumber = 123;
//        System.out.println(myNumber);
// TODO: 3/19/20  Copy and paste the following code blocks one at a time and execute them
//
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
// TODO: 3/19/20  What is the difference between the above code blocks? Explain why the code outputs what it does.


//
// TODO: 3/19/20  Try to create a variable named class. What happens?

//        String class;
//
// TODO: 3/19/20  Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three"; //works
//        Object o = theNumberThree;// works
//        int three = (int) o;// doesnt work

// TODO: 3/19/20  Copy and paste the code above and then run it. Does the result match with your expectation?
//
// TODO: 3/19/20  How is the above example different from the code block below?
//
//
//    int three = (int) "three";

// TODO: 3/19/20  What are the two different types of errors we are observing?
//
// TODO: 3/19/20  Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
        int x = 4;
        x += 5;
        System.out.println(x);

        x = 3;
        int y = 4;
        y = y * x;
        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        System.out.println(x);
//        y -= x;
//        System.out.println(y);


// TODO: 3/19/20  What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        byte myByte = 0;
        int i = 0;
        while (i < 128) {
            myByte++;
            i++;
        }
        System.out.println(myByte);




//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }
}