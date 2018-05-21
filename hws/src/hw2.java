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
        for (int i : mas1) {
            if (i == 1)
                System.out.print("0 ");
            else
                System.out.print("1 ");
        }
    }

    public static void p2() {
        int[] mas2 = new int[8];
        int j = 0;
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = j;
            System.out.print(mas2[i] + " ");
            j += 3;
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
