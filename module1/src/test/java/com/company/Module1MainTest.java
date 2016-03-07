package com.company;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Module1MainTest {

    @Test
    public void testName() throws Exception {
        new Module1MainTest();
        Assert.assertTrue(true);
    }

//    @Test
//    public void shouldNotBeAbleToDependOnModule2() throws Exception {
//     //This test will fail in IntelliJ but does not compile in BUCK
//        Module2Main module2Main = new Module2Main(); //IntelliJ can view module 2 but there is no test depenency on it
//        Assert.assertFalse(module2Main.toString().length() > 0);
//
//    }
}