package JCLVL2.hw1.hw2;

public class Array {
        String[][] array;
        int size = 4;
        int sum = 0;

        public Array(String[][] arr) {
            this.array = arr;
            for (int i = 0; i < size; i++ ){
                if(arr[i].length != size) {
                    throw new MyArraySizeException();
                }
            }
        }

        public void Summation(){

            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    try{
                        int element = Integer.parseInt(array[i][j]);
                        sum += element;
                    }
                    catch (NumberFormatException e){
                        throw new MyArrayDataException (i, j);
                    }
                }
            }
            System.out.println("Sum: " + sum);
        }
}
