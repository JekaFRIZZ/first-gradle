package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void testIsPositiveNumberShouldReturnTrueWhenPositiveNumberApplied() {
        boolean actual = StringUtils.isPositiveNumber("1994");
        assertTrue(actual);
    }

    @Test
    public void testIsPositiveNumberShouldReturnFalseWhenNegativeNumberApplied() {
        boolean actual = StringUtils.isPositiveNumber("-100");
        assertFalse(actual);
    }

    @Test
    public void testIsPositiveNumberShouldReturnFalseWhenZeroApplied() {
        boolean actual = StringUtils.isPositiveNumber("0");
        assertFalse(actual);
    }
}