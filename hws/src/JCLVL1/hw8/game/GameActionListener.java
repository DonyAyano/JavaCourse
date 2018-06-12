package JCLVL1.hw8.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameActionListener implements ActionListener {
    private int cellX;
    private int cellY;
    private GameButton button;

    public GameActionListener(int x, int y, GameButton gButton) {
        cellX = x;
        cellY = y;
        button = gButton;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameButton clicked = (GameButton) e.getSource();
        GameBoard board = clicked.getBoard();

        if (board.isTurnable(cellX, cellY)) {
            updateByRealPlayersData(board);

            if (board.isFull()) {
                board.showMessage("Ничья");
                board.emptyField();
            }
            else if (!board.getGame().getCurrentPlayer().isRealPlayer()) {
                updateByAIData(board);
            }
            else board.showMessage("Некорректный ход");
        }
    }

        private void updateByRealPlayersData (GameBoard board){
            board.updateGameField(cellX, cellY);
            button.setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
            if(board.checkWin()){
                board.showMessage("Вы выиграли");
                board.emptyField();
            }
            else
                board.getGame().passTurn();
        }

        private void updateByAIData (GameBoard board){
            int x, y;
            Random rnd = new Random();

            do{
                x = rnd.nextInt(GameBoard.dimension);
                y = rnd.nextInt(GameBoard.dimension);
            }
            while(!board.isTurnable(x, y));
            button.setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
            board.updateGameField(x, y);

            int cellIndex = GameBoard.dimension * x + y;
            board.setGameButtonCell(cellIndex, board.getGame().getCurrentPlayer().getPlayerSign());

            if(board.checkWin()){
                board.showMessage("Компьютер выиграл");
                board.emptyField();
            }
            else
                board.getGame().passTurn();
        }
}
