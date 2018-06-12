package JCLVL2.hw1.hw2;

public class MyArrayDataException extends IllegalArgumentException{
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public MyArrayDataException(int row, int col) {
        super("Incorrect element at [" + (row+1) + ";"  + (col+1) +"] position. Check it up.");
        this.row = row;
        this.col = col;
    }
}

