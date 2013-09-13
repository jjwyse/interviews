/**
 * 
 */
package com.jjw.interviews.design.gameboard;

import org.junit.Test;

/**
 * @author jjwyse
 * 
 */
public class GameBoardTest
{

    @Test
    public void testGame()
    {
        GameBoard gameBoard = new GameBoard(10, 1);
        gameBoard.start();
    }
}
