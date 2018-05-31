package hw6;

public class Plate {
        public int food;
        public String out;

        public Plate(int food) {
            this.food = food;
        }

        public void decreaseFood(int n) {
        if (food < n) {
            out = "Not enough food. Add some";
            System.out.println(out);
        }
        else {
            out = "0";
            food -= n;
        }
        }

        public void addFood(int k) {
            food += k;
        }

        public void info() {
        System.out.println("plate: " + food);
        }
}


