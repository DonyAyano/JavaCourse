package hw8.game;

public class GamePlayer {
    public static char playerSign;
    public boolean realPlayer = true;

    public GamePlayer(boolean isRealPlayer, char playerSign){
        this.realPlayer = isRealPlayer;
        this.playerSign = playerSign;
    }

    public boolean isRealPlayer(){
        return realPlayer;
    }

    public char getPlayerSign() {
        return playerSign;
    }
}
