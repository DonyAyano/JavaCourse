package JCLVL2.hw1.hw2;

public class ArraySumMain {
    public static void main(String[] args) {
        try{
            Array arr = new Array(new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}
            });

            arr.Summation();
        }
        catch (MyArraySizeException e){
            System.err.println("Size exception found. Fix it");
        }
        catch (MyArrayDataException e){
            System.err.println("Data exception found. Fix it");
        }
        System.out.println("No exeptions found. GGWP");
    }
}
