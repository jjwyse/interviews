package com.jjw.interviews.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayMethods
{
    /**
     * Assumption: we know how many characters are in the character set. If we don't, check out the isUniqueChars2
     * method below which uses a hash set to check for collisions
     * 
     * @param string
     * @return
     */
    public boolean isUniqueChars(String string)
    {
        // do we know the number of characters in this character set? here, i'm assuming that we're talking ASCII
        if (string.length() > 256)
        {
            return false;
        }

        boolean[] indexArray = new boolean[256];
        for (char c : string.toCharArray())
        {
            if (indexArray[c])
            {
                return false;
            }
            indexArray[c] = true;
        }
        return true;
    }

    /**
     * Unicode characters, > 35,000
     * 
     * @param string
     * @return
     */
    public boolean isUniqueChars2(String string)
    {
        HashSet<Object> hashSet = new HashSet<Object>();

        for (char c : string.toCharArray())
        {
            if (hashSet.contains(c))
            {
                return false;
            }
            hashSet.add(c);
        }

        return true;
    }

    /**
     * Is string one a permutation of string two?
     * 
     * @param one
     * @param two
     * @return
     */
    public boolean isPermutation(String one, String two)
    {
        System.out.println("one: " + one);
        System.out.println("two: " + two);

        // lengths must be the same or it's impossible for one to be a permutation of the others
        if (one.length() != two.length())
        {
            return false;
        }
        char[] oneChars = one.toCharArray();
        char[] twoChars = two.toCharArray();

        Arrays.sort(oneChars);
        Arrays.sort(twoChars);

        System.out.println("one sorted: " + oneChars);
        System.out.println("two sorted: " + twoChars);

        for (int i = 0; i < one.length(); i++)
        {
            char a = oneChars[i];
            char b = twoChars[i];

            if (a != b)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Replace all spaces with %20
     * 
     * Assumption: there is already enough space at the end of the array for the two extra characters for each space
     * 
     * @param chars
     * @return
     */
    public char[] replaceSpaces(char[] chars)
    {
        char space = ' ';
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == space)
            {
                shift(chars, i, 2);
                chars[i] = '%';
                chars[i + 1] = '2';
                chars[i + 2] = '0';
                i += 2; // shift up two spaces
            }
        }
        return chars;
    }

    /**
     * Shifts ever element from chars[index]-> end ++2
     * 
     * Assumption: there's enough space in chars to shift things.
     * 
     * @param chars
     * @param index
     */
    private void shift(char[] chars, int index, int spaces)
    {
        for (int i = chars.length - 1 - spaces; i >= index; i--)
        {
            chars[i + spaces] = chars[i];
        }
    }

    /**
     * Take string aaabbc and return a3b2c1
     * 
     * @param s
     * @return
     */
    public String compress(String s)
    {
        StringBuilder compressed = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            int howMany = countInARow(i, s);
            compressed.append(s.charAt(i)).append(howMany);
            i += howMany - 1; // skip ahead to the next letter
        }
        return compressed.toString();
    }

    /**
     * 
     * @param index
     * @param s
     * @return
     */
    private int countInARow(int index, String s)
    {
        int counter = 1;
        char c = s.charAt(index);
        for (int i = index + 1; i < s.length(); i++)
        {
            if (c == s.charAt(i))
            {
                counter++;
            }
            else
            {
                break;
            }
        }
        return counter;
    }
}
