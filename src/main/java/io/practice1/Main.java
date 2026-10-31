package io.practice1;

import io.practice1.utilus.ReverseLetters;

public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";

        String result = ReverseLetters.reverseLetters(text);

        System.out.println(result);
    }
}
