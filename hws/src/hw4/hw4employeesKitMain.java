package hw4;

import java.util.Scanner;

public class hw4employeesKitMain {
    public void kitItself() {
        hw4employees[] kitItem = new hw4employees[5];
        Scanner Name = new Scanner(System.in);
        Scanner Post = new Scanner(System.in);
        Scanner Email = new Scanner(System.in);
        Scanner Holla = new Scanner(System.in);
        Scanner Wage = new Scanner(System.in);
        Scanner Age = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String name = Name.nextLine();
            String post = Post.nextLine();
            String email = Email.nextLine();
            String holla = Holla.nextLine();
            long wage = Wage.nextInt();
            int age = Age.nextInt();
            kitItem[i] = new hw4employees(name, post, email, holla, wage, age);
            System.out.println(name + ", " + ", " + post + ", " + email + ", " + holla + ", " + wage + ", " + age);
        }
    }
}
