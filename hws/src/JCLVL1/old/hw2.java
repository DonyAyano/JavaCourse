package JCLVL1.old;/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место,
        в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
        checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */

import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {
        System.out.println("Task 1 :");
        p1();
        System.out.println();
        System.out.println("Task 2 :");
        p2();
        System.out.println();
        System.out.println("Task 3 :");
        p3();
        System.out.println();
        System.out.println("Task 4 :");
        p4();
        System.out.println("Task 5 :");
        p5();
        System.out.println();
        System.out.println("Task 6 :");
        System.out.println(p6());
        System.out.println("Task 7 :");
        p7();
    }

    public static void p1() {
        int[] mas1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0 ; i < mas1.length ; i++) {
            if (mas1[i] == 1) {
                mas1[i] = 0;
                System.out.print(mas1[i] + " ");
            }
            else {
                mas1[i] = 1;
                System.out.print(mas1[i] + " ");
            }
        }
    }

    public static void p2() {
        int[] mas2 = new int[8];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = i*3;
            System.out.print(mas2[i] + " ");
        }
    }

    public static void p3() {
        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] < 6) {
                mas3[i] *= 2;
                System.out.print(mas3[i] + " ");
            } else
                System.out.print(mas3[i] + " ");
        }
    }

    public static void p4() {
        int[][] mas4 = new int[6][6];
        for (int i = 0; i < mas4.length; i++) {
            for (int j = 0; j < mas4.length; j++) {
                if (i == j)
                    mas4[i][j] = 1;
                System.out.print(mas4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void p5() {
        int[] mas5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -10};
        int min = mas5[0], max = mas5[0];
        for (int i : mas5) {
            if (i < min)
                min = i;
        }
        for (int i : mas5) {
            if (i > max)
                max = i;
        }
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }

    public static boolean p6() {
        int[] mas6 = {1, 1, 1, 2, 1};
        int temp1 = 0;
        boolean res = false;
        for (int i = 0; i < mas6.length - 1; i++) {
            int j, temp2 = 0;
            temp1 += mas6[i];
            for (j = mas6.length - 1; j > i; j--) {
                temp2 += mas6[j];
            }
            System.out.print(temp1 + " ");
            System.out.println(temp2);
            if (temp1 == temp2)
                res = true;
        }
        return res;
    }

    public static void p7() {
        int[] mas7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = -3;
        if (n > 0) {
            while (n > 0) {
                int temp = mas7[mas7.length - 1];
                for (int i = mas7.length - 1; i > 0; i--) {
                    mas7[i] = mas7[i - 1];
                }
                mas7[0] = temp;
                System.out.println(Arrays.toString(mas7));
                --n;
            }
        }
        if (n < 0) {
            while (n < 0) {
                int temp = mas7[0];
                for (int i = 1 ; i < mas7.length ; i++) {
                    mas7[i - 1] = mas7[i];
                }
                mas7[mas7.length - 1] = temp;
                System.out.println(Arrays.toString(mas7));
                ++n;
            }
        }
    }
}
