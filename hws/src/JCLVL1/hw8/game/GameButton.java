package JCLVL1.hw8.game;

import javax.swing.*;

public class GameButton extends JButton {
    private int buttonIndex;
    private int rowNum;
    private int cellNum;
    private GameBoard board;

    public GameButton(int gameButtonIndex, GameBoard currentGameBoard){
        buttonIndex = gameButtonIndex;
        board = currentGameBoard;

        rowNum = buttonIndex / GameBoard.dimension;
        cellNum = buttonIndex % GameBoard.dimension;

        setSize(GameBoard.cellSize - 5, GameBoard.cellSize - 5);
        addActionListener(new GameActionListener(rowNum, cellNum, this));
    }

    public GameBoard getBoard(){
        return board;
    }
}
