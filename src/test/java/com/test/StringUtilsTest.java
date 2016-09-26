package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void testReplaceNull() throws Exception {
        assertNull(null, stringUtils.replaceWithSpaces(null, 'l'));
    }

    @Test
    public void testReplaceEmpty() throws Exception {
        assertEquals("", stringUtils.replaceWithSpaces("", 'l'));
    }

    @Test
    public void testReplaceSpacesSame() throws Exception {
        assertEquals("a  m", stringUtils.replaceWithSpaces("a  m", ' '));
    }

    @Test
    public void testReplace() throws Exception {
        assertEquals("2  2", stringUtils.replaceWithSpaces("2332", '3'));
    }

    @Test
    public void testReplaceAll() throws Exception {
        assertEquals("     ", stringUtils.replaceWithSpaces("ooooo", 'o'));
    }

    @Test
    public void testReplace2lines() throws Exception {
        assertEquals("he  o \n my friend", stringUtils.replaceWithSpaces("hello \n my friend", 'l'));
    }


}