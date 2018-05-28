package hw4;

public class Employees {
    String name;
    String post;
    String email;
    String holla;
    long wage;
    int age;

    public Employees(String _name, String _post, String _email, String _holla, long _wage, int _age){
        this.name = _name;
        this.post = _post;
        this.email = _email;
        this.holla = _holla;
        this.wage = _wage;
        this.age = _age;
    }
    public void print(){
        System.out.print(this.name + " " + this.post + " " + this.email + " " + this.holla + " " + this.wage + " " + this.age );
        System.out.println();
    }
}
