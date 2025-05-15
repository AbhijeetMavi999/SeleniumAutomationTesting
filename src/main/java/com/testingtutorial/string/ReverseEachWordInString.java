package com.testingtutorial.string;

public class ReverseEachWordInString {

    static String reverseEachWord(String str) {
        String[] strArr = str.split(" ");
        String reversedString = "";

        for(String word: strArr) {
            String temp = "";
            for(int i=word.length()-1; i>=0; i--) {
                temp += word.charAt(i);
            }
            reversedString += temp + " ";
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String str = "Selenium Concept Of The Day";
        System.out.println(reverseEachWord(str));
    }
}
