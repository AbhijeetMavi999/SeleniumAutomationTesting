package com.testingtutorial.string;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args) {
        String str = "Automate web pages using selenium";
        String withoutWhiteSpace = str.replaceAll("\\s+", "");

        System.out.println(withoutWhiteSpace);
    }
}
