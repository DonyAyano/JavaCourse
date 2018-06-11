package JCLVL1.hw8.game;

public class Game {
    private GameBoard board;
    private GamePlayer[] gamePlayers = new GamePlayer[2];
    private int playersTurn = 0;

    public Game(){
        board = new GameBoard(this);
        setPvEGame();
    }

    private void setPvEGame(){
        gamePlayers[0] = new GamePlayer(true, 'X');
        gamePlayers[1] = new GamePlayer(false, 'O');
    }

    public void passTurn(){
        if(playersTurn == 0)
            playersTurn = 1;
        else
            playersTurn = 0;
    }

    public int getPlayersIndex(){
        return playersTurn;
    }

    public GamePlayer getCurrentPlayer(){
        return gamePlayers[playersTurn];
    }
}
