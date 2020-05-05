package extrapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeProblems {
   // Write a function that converts hours into seconds.


    public static int HoursToSeconds(int num){
        int seconds = num * 60 * 60;
        return seconds;
    }
    public static int HoursToSeconds() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number of hours");
        int input = s.nextInt();
       return input * 60 *60;

    }

    public static int GetFirstValue(int[] nums){
        return nums[0];
    }

    public static double addSumOfArr(double[] nums){
        double sum = 0;
        for (double num:nums){
           sum += num;
        }
        return sum;
    }

    public static double addSumOfArrList(ArrayList<Double> nums){
        double sum = 0;
        for (double num:nums){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(1.0,2.3, 5.3,4.5,6.5,7.6,6.6));


        int[] arr1 = {1,2,3,4,5,6};
        double[] arr = {1,2,3,4,5,6};


//        System.out.println(HoursToSeconds());
//        System.out.println(HoursToSeconds(1));
        System.out.println(GetFirstValue(arr1));
        System.out.println(addSumOfArr(arr));
        System.out.printf("sum = %.2f ",addSumOfArrList(list));
    }





}
