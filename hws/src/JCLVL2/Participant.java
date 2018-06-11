package JCLVL2;

public interface Participant {
    String getName();
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    boolean isOnDistance();
}
