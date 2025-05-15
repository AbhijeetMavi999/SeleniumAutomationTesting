package com.testingtutorial.number;

public class ArmstrongNumber {

    static boolean isArmstrongNumber(int number) {
        int numLength = String.valueOf(number).length();
        int copyOfNumber = number;
        int sum = 0;

        while(copyOfNumber > 0) {
            int lastDigit = copyOfNumber%10;
            int temp = 1;
            for(int i=0; i<numLength; i++) {
                temp = temp * lastDigit;
            }
            sum += temp;
            copyOfNumber /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(432));
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(407));
    }
}
