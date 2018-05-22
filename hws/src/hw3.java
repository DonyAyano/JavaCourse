/*
1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
2. * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
        "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
 */

import java.util.Scanner;
import java.util.Random;

public class hw3 {
    public static final char DOT = '#';

    public static void main(String[] args) {
        System.out.println("Что хотите угадывать? (1 - числа, 2 - слова)");
        Scanner enter = new Scanner(System.in);
        int p = enter.nextInt();
        if (p == 1) p1();
        if (p == 2) p2();
    }

    public static void p1() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        int x = rand.nextInt(10);
        System.out.println("Компьютер загадал число от 0 до 9. У Вас есть 3 попытки, чтобы отгадать его. Игра началась");
        for (int i = 0; i < 3; i++) {
            int en = scan.nextInt();
            if (en == x) {
                System.out.println("Верно! Повторить игру еще раз? (1-да, 0-нет)");
                int yorn = yn.nextInt();
                if (yorn == 1) {
                    p1();
                } else {
                    System.out.println("Жаль. До свидания.");
                    break;
                }
            }
            if (en > x && i != 2)
                System.out.println("Загаданное число меньше введенного. У Вас осталось " + (2 - i) + " попыток");
            if (en < x && i != 2)
                System.out.println("Загаданное число больше введенного. У Вас осталось " + (2 - i) + " попыток");
            if (i == 2) {
                System.out.println("Вы не угадали загаданное число. Повторить игру еще раз? (1-да, 0-нет)");
                int yorn = yn.nextInt();
                if (yorn == 1) {
                    p1();
                } else {
                    System.out.println("Жаль. До свидания.");
                    break;
                }
            }
        }
    }

    public static void p2() {
        char[] cell = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',};
        String[] guesswords = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        int x = rand.nextInt(24);
        String word = guesswords[x];
        String en;

        System.out.println("Компьютер загадал слово. Угадайте его.");
        do {
            en = scan.nextLine();
            for (int i = 0; i < en.length() && i < word.length(); i++) {
                if (en.charAt(i) == word.charAt(i)) {
                    cell[i] = en.charAt(i);
                }
            }
            System.out.println(cell);
            if (en.equals(word)) {
                System.out.println("Верно! Повторить игру еще раз? (1-да, 0-нет)");
                int yorn = yn.nextInt();
                if (yorn == 1) {
                    p2();
                } else {
                    System.out.println("Жаль. До свидания.");
                    break;
                }
            }
        }
        while (en != word) ;
    }
}

