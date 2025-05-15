package com.testingtutorial.array;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                isSorted = false;
            }
        }
        System.out.println(isSorted ? "Sorted" : "Not Sorted");
    }
}
