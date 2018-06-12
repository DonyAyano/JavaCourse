package JCLVL2.hw1.hw1;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant c) {
        c.jump(height);
    }
}
