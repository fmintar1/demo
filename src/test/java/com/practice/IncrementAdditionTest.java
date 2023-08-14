package com.practice;
import org.junit.Assert;
import org.junit.Test;

public class IncrementAdditionTest {
    
    @Test
    public void incrementCountTest1(){
        Assert.assertEquals(IncrementAddition.incrementCount(3), 10);
    }

    @Test
    public void incrementCountTest2(){
        Assert.assertEquals(IncrementAddition.incrementCount(10), 220);
    }

    @Test
    public void incrementCountTest3(){
        Assert.assertEquals(IncrementAddition.incrementCount(5), 35);
    }

}
