package com.jjw.interviews.design.gameboard;

import java.util.Random;

public class Player
{
    Random myRandom = new Random();
    String myName;

    public Player(String name)
    {
        myName = name;
    }

    public int roll()
    {
        return myRandom.nextInt(6) + 1;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return myName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        myName = name;
    }
}
