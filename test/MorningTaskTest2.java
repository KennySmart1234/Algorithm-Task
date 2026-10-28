import org.junit.Assert;
import org.junit.Test;

public class MorningTaskTest2 {

    @Test
    public void testThatSortedArrayIsCorrect() {
        int[] numbers = {2,20,5,7,3,6};
        int[] expected = {4,9,25,36,49,400};

        int[] actual = MorningTask2.squaresOfIncreasingOderArray(numbers);
        Assert.assertArrayEquals(expected, actual);
    }



    @Test
    public void testThatSortedArrayReturnsCorrectResult() {
        int[] numbers = {7, 4, 5, 2, 3, 6};
        int[] expected = {4, 9, 16, 25, 36, 49};

        int[] actual = MorningTask2.squaresOfIncreasingOderArray(numbers);
        Assert.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void testThatSortedArrayReturnsCorrectResult() {
//        int[] numbers = {7,4,5,2,3,6};
//        int[] expected = {4,9,16,25,36,49};
//
//        int[] actual = MorningTask2.squaresOfIncreasingOderArray(numbers);
//        Assert.assertArrayEquals(expected, actual);
//    }

}
