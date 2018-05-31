package hw6;

public class EatingCats {
    private String name;
    private int appetite;
    private boolean satiety;

    public EatingCats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate p) {
        p.decreaseFood(appetite);
        if (p.out.equals("Not enough food. Add some")) return false;
        else return true;
    }
}
