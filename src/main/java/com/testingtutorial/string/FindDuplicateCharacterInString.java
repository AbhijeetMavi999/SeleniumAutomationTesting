package com.testingtutorial.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "Better Butter";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                if(frequencyMap.containsKey(ch)) {
                    frequencyMap.put(ch, frequencyMap.get(ch) + 1);
                } else {
                    frequencyMap.put(ch, 1);
                }
            }
        }

        System.out.println(frequencyMap);
    }
}
