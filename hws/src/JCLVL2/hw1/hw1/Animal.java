package JCLVL2.hw1.hw1;

public abstract class Animal implements Participant {
        protected String type;
        protected String name;
        protected boolean onDistance;
        protected int maxRunDistance;
        protected int maxJumpHeight;
        protected int maxSwimDistance;

        public String getName() {
            return name;
        }

        @Override
        public boolean isOnDistance() {
            return onDistance;
        }

        public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
            this.type = type;
            this.name = name;
            this.onDistance = true;
            this.maxRunDistance = maxRunDistance;
            this.maxJumpHeight = maxJumpHeight;
            this.maxSwimDistance = maxSwimDistance;
        }

        @Override
        public void run(int distance) {
            if (distance <= maxRunDistance) {
                System.out.println(type + " " + name + " Cross - OK");
            } else {
                System.out.println(type + " " + name + " Cross - FAILED");
                onDistance = false;
            }
        }

        @Override
        public void jump(int height) {
            if (height <= maxJumpHeight) {
                System.out.println(type + " " + name + " Jump - OK");
            } else {
                System.out.println(type + " " + name + " Jump - FAILED");
                onDistance = false;
            }
        }

        @Override
        public void swim(int distance) {
            if (maxSwimDistance == 0) {
                System.out.println(type + " " + name + " Swim - ERROR");
                onDistance = false;
                return;
            }
            if (distance <= maxSwimDistance) {
                System.out.println(type + " " + name + " Swim - OK");
            } else {
                System.out.println(type + " " + name + " Swim - FAILED");
                onDistance = false;
            }
        }
}
