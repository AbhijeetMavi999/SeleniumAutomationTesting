package com.testingtutorial.practice;

public class Main {
    public static void main(String[] args) {
        try {
            int temp = 10/0;
        } finally {
            System.out.println("Always Execute...");
        }
    }
}
