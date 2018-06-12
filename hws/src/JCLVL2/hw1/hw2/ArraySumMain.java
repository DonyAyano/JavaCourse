package JCLVL2.hw1.hw2;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера
необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе
массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
и вывести результат расчета.
 */
public class ArraySumMain {
    public static void main(String[] args) {
        try {
            Array arr = new Array(new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}
            });

            arr.Summation();
        }
        catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
            return;
        }

        System.out.println("No exeptions found. GGWP");
    }
}
