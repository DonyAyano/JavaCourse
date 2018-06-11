package JCLVL2;

public class MainClass {
    public static void main(String[] args) {
        Animal participant1 = new Cat("Barsik");
        Animal participant2 = new Dog("Bobik");
        Human participant3 = new Human("Doni");
        Human participant4 = new Human("Daun");

        Team teamAutist = new Team("Team_Autist", participant1, participant2, participant3, participant4);

        Obstacle[] circle1 = {new Cross(300), new Wall(25), new Cross(400)};
        Obstacle[] circle2 = {new Cross(500), new Wall(5), new Water(7)};
        Obstacle[] circle3 = {new Cross(900), new Wall(50), new Cross(300)};

       // Course course = new Course(circle1,circle2,circle3);


    }
}



