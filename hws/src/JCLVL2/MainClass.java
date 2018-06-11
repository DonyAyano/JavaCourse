package JCLVL2;
/*
1. Разобраться с имеющимся кодом;
2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
(т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию,
метод вывода информации обо всех членах команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить
команду пройти всю полосу;
 */

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

       // course.doIt(teamAutist);
        teamAutist.showResults();

    }
}



