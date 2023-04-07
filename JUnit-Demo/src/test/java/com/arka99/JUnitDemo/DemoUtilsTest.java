package com.arka99.JUnitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {
    @Test
    void testAddEquals() {
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(7, demoUtils.add(4, 3), "4 + 3 should be 7.");
    }

    @Test
    void testAddNotEquals() {
        DemoUtils demoUtils = new DemoUtils();
        assertNotEquals(9, demoUtils.add(4, 4), "4 + 4 should not be 9.");
    }

    @Test
    void testNullOrNotNull() {
        DemoUtils demoUtils = new DemoUtils();
        String string1 = null;
        String string2 = "java";
        assertNull(demoUtils.checkNull(string1), "This object should be null.");
        assertNotNull(demoUtils.checkNull(string2),"This should not be null.");
    }
}
