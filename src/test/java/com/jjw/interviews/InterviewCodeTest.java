package com.jjw.interviews;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewCodeTest
{
    @Test
    public void testIsUniqueChar()
    {
        InterviewCode interviewCode = new InterviewCode();
        assertTrue(interviewCode.isUniqueChars("abcdefg13"));
    }
}
