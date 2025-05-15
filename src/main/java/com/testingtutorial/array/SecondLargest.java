package com.testingtutorial.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        int largest = -1;
        int secondLargest = -1;

        for(int i: nums) {
            if(i > largest) {
                secondLargest = largest;
                largest = i;
            }
            if(i > secondLargest && i < largest) {
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }
}
