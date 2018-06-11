package JCLVL2;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant c) {
        c.run(length);
    }
}
