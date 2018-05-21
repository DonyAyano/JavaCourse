/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
        положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
        при этом каждый 400-й – високосный.
 */

public class hw1 {
    public static void main(String[] args){
        float a = 5.0f, b = 10.0f, c = 15.0f, d = 20.0f;
        int e = 10 , g = 2018;
        String f = "Kirill";

        System.out.println(operation(a,b,c,d));
        System.out.println(comparison(a,b));
        posneg(a);
        System.out.println(ifnegative(e));
        cheers(f);
        leapyear(g);
    }


    public static double operation(float a, float b, float c, float d){
        double result = 0;
        result = a * (b + c/d);
        return result;
    }

    public static boolean comparison(double a, double b){
        if (a+b >= 10 && a+b <= 20)
            return true;
        else return false;
    }

    public static void posneg(double a){
        if (a>=0)
            System.out.println("Positive");
        else System.out.println("negative");
    }

    public static boolean ifnegative(int e){
        if (e>=0)
            return false;
        else return true;
    }

    public static void cheers(String f){
        System.out.println("Hello, " + f + "!");
    }

    public static void leapyear(int g){
        if ((g % 4 == 0 && g % 100 != 0) || g % 400 == 0)
            System.out.println("Leap");
        else System.out.println("Not leap");
    }
}
