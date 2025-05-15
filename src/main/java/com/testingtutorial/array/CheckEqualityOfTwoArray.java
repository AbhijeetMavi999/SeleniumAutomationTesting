package com.testingtutorial.array;

import java.util.Arrays;

public class CheckEqualityOfTwoArray {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        boolean equalOrNot = true;

        // using equal() method
        System.out.println(Arrays.equals(arrayOne, arrayTwo));

        // using for loop
        if(arrayOne.length == arrayTwo.length) {
            for(int i=0; i<arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }

        System.out.print(equalOrNot ? "Equal" : "Not Equal");
    }
}
