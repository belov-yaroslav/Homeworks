package com.from_10_to_rome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] values = {
                1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1
        };

        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };

        String result = "";

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result += symbols[i];
                number -= values[i];
            }
        }

        System.out.println(result);
    }
}
