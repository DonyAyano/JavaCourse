package JCLVL2.hw1.hw1;

public class Course {

    Obstacle[] course = new Obstacle[3];

    public Course(Obstacle obstacle1, Obstacle obstacle2, Obstacle obstacle3){           //TODO загуглить операнд "..."  называется varargs, должен быть последним в сигнатуре метода
        course[0] = obstacle1;
        course[1] = obstacle2;
        course[2] = obstacle3;
    }

    public void doIt(Team team){
        for (Participant c : team.getTeam()) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    System.out.println(c.getName() + " OUT");
                    break;
                }
            }
        }
    }

}
