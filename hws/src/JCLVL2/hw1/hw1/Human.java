package JCLVL2.hw1.hw1;

public class Human implements Participant {
    protected String name;
    protected boolean active;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    public String getName() {
        return name;
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.active = true;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 100;
        this.maxSwimDistance = 2000;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " Cross - OK");
        } else {
            System.out.println(name + " Cross - FAILED");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " Jump - OK");
        } else {
            System.out.println(name + " Jump - FAILED");
            active = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " Swim - OK");
        } else {
            System.out.println(name + " Swim - FAILED");
            active = false;
        }
    }
}
