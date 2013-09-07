package com.jjw.interviews.design.gameboard;

import java.util.List;

public class GameBoard
{
    private List<Space> mySpaces;
    private List<Player> myPlayers;

    public GameBoard(int width, int height, int numberOfPlayers)
    {
        int numberOfSpaces = width * height;
        for (int i = 0; i < numberOfSpaces; i++)
        {
            mySpaces.add(new Space(SpaceType.GAME_OVER));
        }

        for (int i = 0; i < numberOfPlayers; i++)
        {
            myPlayers.add(new Player("Player" + i));
        }
    }

    public void start()
    {
        for (Player player : myPlayers)
        {
            System.out.println("Player: " + player.getName() + " is up");

            int numberOfMoves = player.roll();

            System.out.println(player.getName() + " rolled a: " + numberOfMoves);

            Space space = mySpaces.get(numberOfMoves);
            space.setPlayer(player);

            boolean isGameOver = checkSpace(space);
            if (isGameOver)
            {
                System.out.println("Game is over because player: " + player.getName() + " landed on game over space");
                break;
            }
        }
    }

    private boolean checkSpace(Space space)
    {
        if (space.getSpaceType().equals(SpaceType.GAME_OVER))
        {
            return true;
        }

        return false;
    }

    /**
     * @return the spaces
     */
    public List<Space> getSpaces()
    {
        return mySpaces;
    }

    /**
     * @param spaces the spaces to set
     */
    public void setSpaces(List<Space> spaces)
    {
        mySpaces = spaces;
    }

    /**
     * @return the players
     */
    public List<Player> getPlayers()
    {
        return myPlayers;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(List<Player> players)
    {
        myPlayers = players;
    }
}
