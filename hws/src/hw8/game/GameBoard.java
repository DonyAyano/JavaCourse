package hw8.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JFrame {
    static int dimension = 3;
    static int cellSize = 150;
    private char[][] gameField;
    private GameButton[] gameButtons;
    private Game game;
    char nullSymbol = '\u0000';

    public GameBoard(Game currentGame) {
        game = currentGame;
        initField();
    }

    private void initField() {
        setBounds(cellSize * dimension, cellSize * dimension, 400, 300);
        setTitle("Крестики-нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        JButton newGameButton = new JButton("Новая игра");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptyField();
            }
        });
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(newGameButton);
        controlPanel.setSize(cellSize * dimension, 150);

        JPanel gameFieldPanel = new JPanel();
        gameFieldPanel.setLayout(new GridLayout(dimension, dimension));
        gameFieldPanel.setSize(cellSize * dimension, cellSize * dimension);

        gameField = new char[dimension][dimension];
        gameButtons = new GameButton[dimension * dimension];

        for (int i = 0; i < (dimension * dimension); i++) {
            GameButton fieldButton = new GameButton(i, this);
            gameFieldPanel.add(fieldButton);
            gameButtons[i] = fieldButton;
        }

        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(gameFieldPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public Game getGame() {
        return game;
    }

    public void emptyField() {
        for(int i = 0 ; i < dimension*dimension ; i++){
            gameButtons[i].setText("");

            int x = i / GameBoard.dimension;
            int y = i % GameBoard.dimension;

            gameField[x][y] = nullSymbol;
        }
    }

    public boolean isTurnable(int x, int y) {
        boolean result = false;
        if (gameField[y][x] == nullSymbol)
            result = true;
        return result;
    }

    public void showMessage(String messageText) {
        JOptionPane.showMessageDialog(this, messageText);
    }

    public boolean isFull() {
        boolean result = true;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (gameField[i][j] == nullSymbol)
                    result = false;
            }
        }
        return result;
    }

    public  void updateGameField(int x, int y){
        gameField[y][x] = game.getCurrentPlayer().getPlayerSign();
    }

    public boolean checkWin(){
        boolean result = false;

        if(gameField[0][0] == GamePlayer.playerSign && gameField[0][1] == GamePlayer.playerSign && gameField[0][2] == GamePlayer.playerSign) result = true;
        if(gameField[1][0] == GamePlayer.playerSign && gameField[1][1] == GamePlayer.playerSign && gameField[1][2] == GamePlayer.playerSign) result = true;
        if(gameField[2][0] == GamePlayer.playerSign && gameField[2][1] == GamePlayer.playerSign && gameField[2][2] == GamePlayer.playerSign) result = true;
        if(gameField[0][0] == GamePlayer.playerSign && gameField[1][0] == GamePlayer.playerSign && gameField[2][0] == GamePlayer.playerSign) result = true;
        if(gameField[0][1] == GamePlayer.playerSign && gameField[1][1] == GamePlayer.playerSign && gameField[2][1] == GamePlayer.playerSign) result = true;
        if(gameField[0][2] == GamePlayer.playerSign && gameField[1][2] == GamePlayer.playerSign && gameField[2][2] == GamePlayer.playerSign) result = true;
        if(gameField[0][0] == GamePlayer.playerSign && gameField[1][1] == GamePlayer.playerSign && gameField[2][2] == GamePlayer.playerSign) result = true;
        if(gameField[2][0] == GamePlayer.playerSign && gameField[1][1] == GamePlayer.playerSign && gameField[0][2] == GamePlayer.playerSign) result = true;
        return result;
    }

    public void setGameButtonCell(int index, char sign){

    }


}
