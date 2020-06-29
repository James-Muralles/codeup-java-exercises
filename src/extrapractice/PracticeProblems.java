package extrapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeProblems {

//    public static int HoursToSeconds(int num){
//        int seconds = num * 60 * 60;
//        return seconds;
//    }
//    public static int HoursToSeconds() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number of hours");
//        int input = s.nextInt();
//       return input * 60 *60;
//
//    }

//    public static int GetFirstValue(int[] nums){
//        return nums[0];
//    }

//    public static double addSumOfArr(double[] nums){
//        double sum = 0;
//        for (double num:nums){
//           sum += num;
//        }
//        return sum;
//    }

//    public static double addSumOfArrList(ArrayList<Double> nums){
//        double sum = 0;
//        for (double num:nums){
//            sum += num;
//        }
//        return sum;
//    }
//    public static double average(double num){
//       int sum = 0;
//        for (double i = 1; i <= num; i++){
//            sum += i;
//        }
//        return sum/num;
//
//    }

//    public static String nSidedShape(int sides) {
//        switch (sides) {
//            case 1:
//                return "circle";
//            case 2:
//                return "semi-circle";
//            case 3:
//                return "triangle";
//            case 4:
//                return "square";
//            case 5:
//                return "pentagon";
//            case 6:
//                return "hexagon";
//            case 7:
//                return "heptagon";
//            case 8:
//                return "octagon";
//            case 9:
//                return "nonagon";
//            case 10:
//                return "decagon";
//            default:
//                return "not a correct number of sides";
//        }


    public static String sayHello(String name) {
        return " Hello " + name + " !";

    }


    public static void main(String[] args) {
//            ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(1.0, 2.3, 5.3, 4.5, 6.5, 7.6, 6.6));
//
//
//
//            int[] arr1 = {1, 2, 3, 4, 5, 6};
//            double[] arr = {1, 2, 3, 4, 5, 6};


//        System.out.println(HoursToSeconds());
//        System.out.println(HoursToSeconds(1));
//            System.out.println(GetFirstValue(arr1));
//            System.out.println(addSumOfArr(arr));
//            System.out.printf("sum = %.2f\n", addSumOfArrList(list));
//            System.out.println(nSidedShape(3));
//            System.out.println(average(6));
        ArrayList<Integer> coin = new ArrayList<>();
        coin.add(5);
        coin.add(3);
        coin.add(1);
        System.out.println(coin.size());
        System.out.println(coin);

        System.out.println("Here is the fib sequence " + fibionacci(9));
        System.out.println(countChange(coin,20));

    }


    public static int fibionacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibionacci(n - 1) + fibionacci(n - 2);
        }
    }

    public static int countChange(ArrayList<Integer> coins, int value ){
        ArrayList<Integer> dispatched = new ArrayList<>();
        for (int i = 0; i < coins.size(); i++){
            dispatched.add(0);
        }

       for (int c = 0; value > 0; c++){
            dispatched.set(c, (int) Math.floor(value / coins.get(c)));
                    value -= dispatched.get(c) * coins.get(c);

        }
       int sum = 0;
       for (int s: dispatched) {
           sum += s;
       }
        return sum;
    }




}





