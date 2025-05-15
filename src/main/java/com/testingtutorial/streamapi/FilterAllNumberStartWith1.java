package com.testingtutorial.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterAllNumberStartWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> startWith1 = myList.stream().filter((s) -> s.toString().startsWith("1")).toList();
        System.out.print(startWith1);
    }
}
