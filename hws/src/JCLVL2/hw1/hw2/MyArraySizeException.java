package JCLVL2.hw1.hw2;
//TODO как узнать лишние элементы
public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    public MyArraySizeException() {
        super("Incorrect array length");
    }
}
