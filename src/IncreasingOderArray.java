
public class IncreasingOderArray {
    public static int[] squaresOfIncreasingOderArray(int[] array) {

        for (int countOne = 0; countOne < array.length; countOne++) {
            for (int countTwo = 0; countTwo < array.length-1; countTwo++) {

            if (array[countTwo] > array[countTwo + 1]) {
                int temp = array[countTwo];
                array[countTwo] = array[countTwo + 1];
                array[countTwo + 1] = temp;
                }
            }
        }

        int[] squares = new int[array.length];

        for (int count = 0; count < array.length; count++) {
            squares[count] = array[count] * array[count];

        }

        return squares;
    }
    public static void main(String[] args) {
        squaresOfIncreasingOderArray(new int[]{10,32,4,5,6,17,6,9,1});
    }


}
