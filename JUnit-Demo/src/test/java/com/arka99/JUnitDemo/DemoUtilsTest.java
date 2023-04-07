package com.arka99.JUnitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

}
