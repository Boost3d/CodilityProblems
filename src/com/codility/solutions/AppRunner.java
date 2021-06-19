package com.codility.solutions;

public class AppRunner {

    public static void main(String[] args) {

        int integer = 1041;
        String binaryString = Integer.toBinaryString(integer);
        System.out.println("Binary String:");
        System.out.println(binaryString);
        System.out.println("Max Binary Gap Result:");
        System.out.println(BinaryGap.returnMaxBinaryGap(binaryString));
    }
}
