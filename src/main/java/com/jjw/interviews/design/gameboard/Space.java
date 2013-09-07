package com.jjw.interviews.design.gameboard;

public class Space
{
    SpaceType mySpaceType;

    Player myPlayer;

    public Space(SpaceType spaceType)
    {
        mySpaceType = spaceType;
        myPlayer = null;
    }

    /**
     * @return the spaceType
     */
    public SpaceType getSpaceType()
    {
        return mySpaceType;
    }

    /**
     * @param spaceType the spaceType to set
     */
    public void setSpaceType(SpaceType spaceType)
    {
        mySpaceType = spaceType;
    }

    /**
     * @return the player
     */
    public Player getPlayer()
    {
        return myPlayer;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player)
    {
        myPlayer = player;
    }
}
