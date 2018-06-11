package JCLVL1.hw6;

import java.util.Scanner;

/*
Расширить задачу про котов и тарелки с едой.
Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
public class MainClass {
        public static void main(String[] args) {
            EatingCats[] cats = new EatingCats[3];
            Scanner catName = new Scanner(System.in);
            Scanner catAppetite = new Scanner(System.in);
            for (int i = 0; i < 3; i++){
                String name = catName.nextLine();
                int  appetite = catAppetite.nextInt();
                cats[i] = new EatingCats(name, appetite);
            }
            Plate plate = new Plate(20);
            plate.info();
            System.out.println(cats[1].eat(plate));
            plate.addFood(10);
            System.out.println(cats[2].eat((plate)));
            plate.info();
        }
}
