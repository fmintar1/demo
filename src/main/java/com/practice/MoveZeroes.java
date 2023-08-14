package com.practice;

import java.util.*;

public class MoveZeroes {
    
    public static Integer[] moveZeroes(Integer[] numArray) {
        //create a loop to traverse through the array. Using a bubble sort method and a reverse ordered loop, if the previous number is 0, switch it with the current number if the current number is not 0
        for(int i = 1; i < numArray.length; i++) {
            if(numArray[i] != 0 && numArray[i-1] == 0) {
                int j = i;

                //reverse loop with bubble sort
                while(numArray[j] != 0 && numArray[j-1] == 0) {
                    int temp = numArray[j];
                    numArray[j] = 0;
                    numArray[j-1] = temp;
                    j--;
                    if (j == 0) {
                        break;
                    }
                }
            }
        }
        return numArray;
    }
}
