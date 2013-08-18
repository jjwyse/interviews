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
    }

    @Test
    public void testCompress()
    {
        String one = "aaabbcaaaabbabbbb";
        System.out.println("before: " + one);
        String result = arrays.compress(one);
        System.out.println("after: " + result);
    }
}
