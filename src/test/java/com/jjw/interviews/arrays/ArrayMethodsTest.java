/**
 * 
 */
package com.jjw.interviews.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jjwyse
 * 
 */
public class ArrayMethodsTest
{
    ArrayMethods arrays = new ArrayMethods();

    /**
     * Test method for {@link com.jjw.interviews.arrays.ArrayMethods#isUniqueChars(java.lang.String)}.
     */
    @Test
    public void testIsUniqueChars()
    {
        String one = "abcdefg";
        String two = "asdfer";
        String three = "jjaf";
        assertTrue(arrays.isUniqueChars(one));
        assertTrue(arrays.isUniqueChars(two));
        assertFalse(arrays.isUniqueChars(three));
    }

    /**
     * Test method for {@link com.jjw.interviews.arrays.ArrayMethods#isUniqueChars2(java.lang.String)}.
     */
    @Test
    public void testIsUniqueChars2()
    {
        String one = "abcdefg";
        String two = "asdfer";
        String three = "jjaf";
        assertTrue(arrays.isUniqueChars2(one));
        assertTrue(arrays.isUniqueChars2(two));
        assertFalse(arrays.isUniqueChars2(three));
    }

    @Test
    public void testIsPermutation()
    {
        String one = "abcdefg";
        String two = "asdfer";
        String three = "jjaf";
        assertFalse(arrays.isPermutation(one, two));
        assertFalse(arrays.isPermutation(two, three));

        one = "joshua wyse";
        two = "oshjua yews";
        assertTrue(arrays.isPermutation(one, two));
    }

    @Test
    public void testReplaceSpaces()
    {
        String one = "ab cd efg    ";
        System.out.println("before: " + one);
        char[] result = arrays.replaceSpaces(one.toCharArray());
        System.out.print("after: ");
        for (char c : result)
        {
            System.out.print(c);
        }
        System.out.println();
        String resultString = new String(result);
        assertTrue("ab%20cd%20efg".equals(resultString));
    }

    @Test
    public void testCompress()
    {
        String one = "aaabbcaaaabbabbbb";
        System.out.println("before: " + one);
        String result = arrays.compress(one);
        System.out.println("after: " + result);
        assertTrue("a3b2c1a4b2a1b4".equals(result));
    }

    /**
     */
    @Test
    public void rotateArray()
    {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;

        printArray(matrix);
        arrays.rotate(matrix);
        printArray(matrix);
    }

    /**
     * Helper function to print a 2-D array
     */
    private void printArray(int[][] matrix)
    {
        System.out.println();
        for (int i = 0; i < matrix[0].length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
