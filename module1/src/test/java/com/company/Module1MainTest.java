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

    @Test
    public void shouldBeAbleToDependOnModule2() throws Exception {
        // the module_config() macro automatically makes make java_test() deps always depend on java_library() deps
        Module2Main module2Main = new Module2Main();
        Assert.assertTrue(module2Main.toString().length() > 0);

    }
}