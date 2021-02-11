package io.math.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @Test
    void addNumbers() {
        // System.out.println("this test should run...");
        //fail("failed");
        Calculation calculation=new Calculation();
        int expected=2;
        int actual= calculation.addNumbers(1,1);
        Assertions.assertEquals(expected,actual,"addition of two numbers");
    }


    @Test
    void computeArea() {
        Calculation calculation=new Calculation();
        double expected=((22/7)*2);
        double actual= calculation.computeArea(1);
        Assertions.assertEquals(expected,actual,"area calculation of circle");
    }
}