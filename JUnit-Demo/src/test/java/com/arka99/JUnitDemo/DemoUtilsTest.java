package com.arka99.JUnitDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;

    /**
     * initiate the object before each test case
     */
    @BeforeEach
    void setUpBeforeEach() {
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
        assertNotNull(demoUtils.checkNull(string2), "This should not be null.");
    }

    @Test
    @DisplayName("Check objects are same or not")
    void assertSameOrNotSame() {
        String string = "Programming Learning";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the same object");
        assertNotSame(string, demoUtils.getAcademy(), "Objects should not refer to the same object");
    }

    @Test
    @DisplayName("check if true or false")
    void assertTrueOrFalse() {
        assertTrue(demoUtils.isGreater(10, 8));
        assertFalse(demoUtils.isGreater(10, 12));
    }

    @Test
    @DisplayName("check if array is equal")
    void testArrayEquals() {
        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be same");
    }

    @Test
    @DisplayName("Check if two iterables are equal")
    void testIterableEquals() {
        List<String> stringList = List.of("Programming", "Learning", "Academy");
        assertIterableEquals(stringList, demoUtils.getAcademyInList(), "Both iterables should be equal.");
    }

    @Test
    @DisplayName("Check if two List of Strings are equal.")
    void testLinesMatch() {
        List<String> stringLine = List.of("Programming", "Learning", "Academy");
        assertLinesMatch(stringLine, demoUtils.getAcademyInList(), "Both Lists of Strings should be equal.");
    }
    @Test
    @DisplayName("Check if an exception is thrown or not")
    void testThrowsAndDoesNotThrow() {
        assertThrows(Exception.class, ()->demoUtils.throwException(-2), "Method should throw an exception.");
        assertDoesNotThrow(()->demoUtils.throwException(5),"Method should not throw exception.");
    }
}
