package sef.FinalActivity;

import sef.module3.activity.Person;

public class SecondActivity {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        int[] nums = {1, 2, 3, 4};
//
        System.out.println("Addition - " + add(x,y));
        System.out.println("Subtraction - " + subtract(x,y)); // x = 10, y - 20 =  10 - (-20)
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x,y));
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            // complete the code
            diff = x-y;
        } else {
            // complete the code
            diff = y-x;
        }

        return diff;
    }

    public static int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }


    public static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 || y == 0) {
            System.out.println("One of the number is 0, I can't do the divide operation");
            divValue = 0;
            // complete the code
        } else {
            divValue = x/y;
            // complete the code
        }
        return divValue;
    }
}

