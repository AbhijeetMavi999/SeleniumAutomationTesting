package com.testingtutorial.string;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Automation Testing";
        String reversedString = "";

        // Using loop
        for(int i=str.length()-1; i>=0; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println(reversedString);

        // Using reverse() method
        StringBuilder sb = new StringBuilder(str);  // StringBuilder for better performance when thread-safety is not required
        System.out.println(sb.reverse());
    }
}
