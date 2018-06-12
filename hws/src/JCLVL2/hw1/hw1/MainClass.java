package JCLVL2.hw1.hw1;
/*
TODO чекнуть про отладку
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

        Course circle1 = new Course(new Cross(300), new Wall(25), new Cross(400));


        circle1.doIt(teamAutist);
        teamAutist.showResults();

    }
}



