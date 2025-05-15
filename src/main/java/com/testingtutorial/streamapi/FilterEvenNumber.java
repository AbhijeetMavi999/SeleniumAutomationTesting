package com.testingtutorial.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> evenList = list.stream().filter((n) -> n%2 == 0).toList();
        System.out.println(evenList);
    }
}
