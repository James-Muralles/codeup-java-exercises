import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }
//        for(int i = 0; i<=15; i++) {
//            System.out.println(i + "");
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+= 2;
//        }
//        while (i<=100);
//        for(int i = 0; i<=100; i+=2) {
//            System.out.println(i);
//        }

//       int i = 100;
//        do {
//            System.out.println(i);
//            i-= 5;
//        }
//        while (i>=-10);
//        for(int i = 100; i>=-10; i-=5) {
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i*i;
//
//        }
//        while (i<= 1000000);
//        for(long i = 2; i<=1000000; i*=i) {
//            System.out.println(i);
//        }

// TODO: 3/20/20  FizzBuzz

//for (int i = 0; i <= 100; i++){
//    if (i % 15 == 0 ){
//        System.out.println("FizzBuzz");
//    }else if( i % 3 == 0){
//        System.out.println("Fizz");
//    }else if( i % 5 == 0){
//        System.out.println("Buzz");
//    }else {
//        System.out.println(i);
//    }
//}

//        System.out.println("Please enter an integer");
//        int num = Input.java.nextInt();
//        System.out.printf("number | squared | cubed%n------ | ------- | ----");
//        for (int i = 1; i <= num; i++) {
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%n%-7d| %-8d| %-4d", i, squared, cubed);
//        }
//


        System.out.println("Please enter a numeric grade from 0-100.");
        int grade = input.nextInt();
        String question = "Do you want to continue?";
        if (grade <= 59) {
            System.out.println("F");
        } else if (grade > 59 && grade <= 66) {
            System.out.println("D");
        } else if (grade > 66 && grade <= 79) {
            System.out.println("C");
        } else if (grade > 79 && grade <= 89) {
            System.out.println("B");
        } else if (grade > 89) {
            System.out.println("A");
        }
        else {
            System.out.println(question);
            String inputAnswer = input.nextLine();
        }



    }
}
