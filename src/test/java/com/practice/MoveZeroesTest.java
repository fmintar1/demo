package com.practice;
import java.util.*;

import org.junit.*;

public class MoveZeroesTest {
    
    @Test
    public void moveZeroesTest1(){
        //Given
        Integer[] numArray = {0, 1, 0, 2, 13};
        Integer[] expected = {1, 2, 13, 0, 0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void moveZeroesTest2(){
        //Given
        Integer[] numArray = {0, 0, 13, 4, 2};
        Integer[] expected = {13, 4, 2, 0, 0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);

    }

    @Test
    public void moveZeroesTest3(){
        //Given
        Integer[] numArray = {0, 1, 5, 0, 4, 13, 0, 0, 12, 4, 0, 0, 0};
        Integer[] expected = {1, 5, 4, 13, 12, 4, 0, 0, 0, 0, 0, 0, 0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);

    }

    @Test
    public void moveZeroesTest4(){
        //Given
        Integer[] numArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        Integer[] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);

    }

    @Test
    public void moveZeroesTest5(){
        //Given
        Integer[] numArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Integer[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);
        
    }

    @Test
    public void moveZeroesTest6(){
        //Given
        Integer[] numArray = {0};
        Integer[] expected = {0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);
        
    }
    @Test
    public void moveZeroesTest7(){
        //Given
        Integer[] numArray = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0, 10};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        List<Integer> expectedList = Arrays.asList(expected);

        //When
        Integer[] actual = MoveZeroes.moveZeroes(numArray);
        List<Integer> actualList = Arrays.asList(actual);

        //Then
        Assert.assertEquals(expectedList, actualList);
        
    }

}
