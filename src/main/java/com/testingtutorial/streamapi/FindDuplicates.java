package com.testingtutorial.streamapi;
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueValues = myList.stream().filter((n) -> !set.add(n)).toList();
        System.out.println(uniqueValues);
    }
}
