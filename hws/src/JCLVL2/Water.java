package JCLVL2;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant c) {
        c.swim(length);
    }
}