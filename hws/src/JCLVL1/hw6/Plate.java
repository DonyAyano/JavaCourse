package JCLVL1.hw6;

public class Plate {
        public int food;
        public String status;

        public Plate(int food) {
            this.food = food;
        }

        public void decreaseFood(int catEat) {
            if (food < catEat) {
                status = "Not enough food. Add some";
                System.out.println(status);
            }
            else {
                status = "";
                food -= catEat;
            }
        }

        public void addFood(int foodAdd) {
            food += foodAdd;
        }

        public void info() {
        System.out.println("plate: " + food);
        }
}


