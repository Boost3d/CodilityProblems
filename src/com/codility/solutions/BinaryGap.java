package com.codility.solutions;

public class BinaryGap {

    // Lesson 1 - Iterations
    // Find longest sequence of zeros in binary representation of an integer.

    /*  Pseudocode

    Convert integer to binary
    Iterate through binary string
    1 - start count if count not started
    Next: 0 - add to count
    Next: 1 - if count started, compare count against max count
    - If greater than max count, SAVE to max count then reset count
    - If NOT greater than max count, reset count

     */

    public static int returnMaxBinaryGap(String binaryString){

        boolean countStarted = false;
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < binaryString.length(); i++ ){
            if(binaryString.charAt(i)=='1'){
                if (countStarted){
                    if(count>=maxCount){
                        maxCount = count;
                    }
                }
                count=0;
                countStarted=true; // This will "trigger" the ongoing count on the first 1 encountered. The counting just keeps going but result is only stored on pass of another 1 and if count exceeds max count.
            }
            if(binaryString.charAt(i)=='0'){
                count++;
            }
        }
        return maxCount;
    }
}

