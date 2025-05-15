package com.testingtutorial.array;

public class SeparateZerosFromNonZeros {
    public static void main(String[] args) {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};
        int index = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}
