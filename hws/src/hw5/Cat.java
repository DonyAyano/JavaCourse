package hw5;

// (int)(( Math.random() * (b - a + 1) + a) --- math.random для отрезка целых чисел
// ( Math.random() * (b-a) ) + a

public class Cat extends Animals {


   private int maxRunDistance = (int) (Math.random()*(100 + 1)) + 150;
   private double maxJumpHeight = (Math.random()*1) + 1.5;

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean run(int runDistance){
       return  (runDistance > maxRunDistance || runDistance <= 0);
    }

    @Override
    public void swim(int swimDistance){
        System.out.println("cat swim: false");
    }

    @Override
    public void jump(int jumpHeight){
        if (jumpHeight > maxJumpHeight || jumpHeight <= 0)
            System.out.println("cat jump: false");
        else System.out.println("cat jump: true");
    }
    //TODO google:  ||    |   a && b   a & b

}
