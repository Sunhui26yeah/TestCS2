package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class OldVTest {

    @Test
    public void testSnippetPath1Result3() {
        // x = 4, y = 16 (y == x * x and y > 8)
        int result = oldV.snippet(4, 16);
        assertEquals(3, result);
    }

    @Test
    public void testSnippetPath2Result13() {
        // x = 4, y = 9 (y != x * x and y > 8)
        int result = oldV.snippet(4, 9);
        assertEquals(13, result);
    }

    @Test
    public void testSnippetPath1Result4() {
        // x = 2, y = 4 (y == x * x and y <= 8)
        int result = oldV.snippet(2, 4);
        assertEquals(4, result);
    }

    @Test
    public void testSnippetPath2Result14() {
        // x = 2, y = 5 (y != x * x and y <= 8)
        int result = oldV.snippet(2, 5);
        assertEquals(14, result);
    }

    @Test
    public void testSnippetXNegative() {
        // x <= 0, should return 0
        int result = oldV.snippet(-1, 4);
        assertEquals(0, result);
    }
}

