package com.testingtutorial.string;

import java.util.Arrays;

public class AnagramString {

    static boolean isAnagram(String s1, String s2) {
        String s1WithoutSpace = s1.replaceAll("\\s+", "").toLowerCase();
        String s2WithoutSpace = s2.replaceAll("\\s+", "").toLowerCase();

        if(s1WithoutSpace.length() != s2WithoutSpace.length()) {
            return false;
        }

        char[] chS1 = s1WithoutSpace.toCharArray();
        char[] chS2 = s2WithoutSpace.toCharArray();

        Arrays.sort(chS1);
        Arrays.sort(chS2);

        boolean status = Arrays.equals(chS1, chS2);
        return status;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Mother In Law", "Hitler Woman"));
        System.out.println(isAnagram("keEp", "peeK"));
        System.out.println(isAnagram("SiLeNtu CAT", "LisTen AcT"));
    }
}
