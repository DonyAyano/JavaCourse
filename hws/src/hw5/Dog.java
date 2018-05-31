package hw5;

public class Dog extends Animals{
//    int runDistance;
//    int jumpHeight;
//    int swimDistance;
    int maxRunDistance = (int) (Math.random()*(100 + 1)) + 450;
    int maxSwimDistance = (int) (Math.random()*(10 + 1)) + 5;
    double maxJumpHeight = (Math.random()*0.6) + 0.2;

    @Override
    public boolean run(int runDistance){
        return (runDistance > maxRunDistance || runDistance <= 0);
    }

    @Override
    public void swim(int swimDistance){
        if (swimDistance > maxSwimDistance || swimDistance <= 0)
            System.out.println("dog swim: false");
        else System.out.println("dog swim: true");
    }

    @Override
    public void jump(int jumpHeight){
        if (jumpHeight > maxJumpHeight || jumpHeight <= 0)
            System.out.println("dog jump: false");
        else System.out.println("dog jump: true");
    }
}
