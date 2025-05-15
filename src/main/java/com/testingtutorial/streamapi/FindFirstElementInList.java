package com.testingtutorial.streamapi;
import java.util.*;

public class FindFirstElementInList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer firstValue = myList.stream().findFirst().get();
        System.out.println(firstValue);
    }
}
