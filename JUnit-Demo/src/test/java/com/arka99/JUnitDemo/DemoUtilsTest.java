package com.arka99.JUnitDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;

    /**
     * initiate the object before each test case
     */
    @BeforeEach
    void setUpBeforeEach()
    {
        demoUtils = new DemoUtils();
    }

    /**
     * test method to check whether the result equals or not
     */
    @Test
    @DisplayName("Check equals or not equals")
    void testAddEqualsAndNotEquals() {
        assertEquals(7, demoUtils.add(4, 3), "4 + 3 should be 7.");
        assertNotEquals(9, demoUtils.add(4, 4), "4 + 4 should not be 9.");
    }


    /**
     * test method to check whether the object is null or not null
     */
    @Test
    @DisplayName("Check Null or not null")
    void testNullOrNotNull() {
        String string1 = null;
        String string2 = "java";
        assertNull(demoUtils.checkNull(string1), "This object should be null.");
        assertNotNull(demoUtils.checkNull(string2),"This should not be null.");
    }
}
