package com.practice;

public class IncrementAddition {
    
    public static int incrementCount(int n) {
        int result = 0;
        int loopCounter = 0;
        int innerLoopCounter = 1;
        while(loopCounter < n) {
            for(int i = 1; i <= innerLoopCounter; i++) {
                result+=i;
            }
            loopCounter++;
            innerLoopCounter++;
        }
        return result;
    }

}
