/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
Конструктор класса должен заполнять эти поля при создании объекта;
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
Создать массив из 5 сотрудников:
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000,
30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

package hw4;

import java.util.Scanner;

public class EmployeesMain {
    public static void main(String[] args) {
        Employees[] kit = new Employees[5];
        Scanner _name = new Scanner(System.in);
        Scanner _post = new Scanner(System.in);
        Scanner _email = new Scanner(System.in);
        Scanner _holla = new Scanner(System.in);
        Scanner _wage = new Scanner(System.in);
        Scanner _age = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String name = _name.nextLine();
            String post = _post.nextLine();
            String email = _email.nextLine();
            String holla = _holla.nextLine();
            long wage = _wage.nextInt();
            int age = _age.nextInt();
            kit[i] = new Employees(name, post, email, holla, wage, age);
            System.out.println(name + ", " + ", " + post + ", " + email + ", " + holla + ", " + wage + ", " + age);
        }

        for (Employees item: kit){
            if (item.age > 40)
                item.print();
        }
    }
}
