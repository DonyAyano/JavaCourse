package JCLVL1.hw4;

public class Employees {
    String name;
    String post;
    String email;
    String holla;
    long wage;
    int age;

    public Employees(String name, String post, String email, String holla, long wage, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.holla = holla;
        this.wage = wage;
        this.age = age;
    }
    public void print(){
        System.out.print(name + " " + post + " " + email + " " + holla + " " + wage + " " + age );
        System.out.println();
    }
}
