package com.example.Demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ananya on 5/28/2018.
 */
public class SampleTest {

    Sample sample = new Sample();

    @Test
    public void fizzBuzzTest_case1(){
        String expected = sample.fizzOrBuzz(15);
        Assert.assertEquals(expected,"FizzBuzz");
    }

    @Test
    public void fizzBuzz_case2(){
        String expected = sample.fizzOrBuzz(5);
        Assert.assertEquals(expected,"Buzz");
    }

    @Test
    public void fizzBuzz_case3(){
        String expected = sample.fizzOrBuzz(3);
        Assert.assertEquals(expected,"Fizz");
    }
}
