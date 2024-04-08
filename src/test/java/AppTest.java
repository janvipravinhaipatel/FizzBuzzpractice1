package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class AppTest extends TestCase {
    public AppTest(String testName){super(testName);}
    public static Test suite(){return new TestSuite(AppTest.class);}

public void testApp()
{
    assertEquals("Fizz",App.FizzBuzz(3));
    assertEquals("Buzz",App.FizzBuzz(5));
}
}
