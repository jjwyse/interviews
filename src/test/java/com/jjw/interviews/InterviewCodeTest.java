package com.jjw.interviews;

import org.junit.Test;

import com.jjw.interviews.InterviewCode;

public class InterviewCodeTest
{
    @Test
    public void test()
    {
        InterviewCode interviewCode = new InterviewCode();
        assert (interviewCode.isUniqueChars("abcdefg13"));
    }
}