import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class MorningTask1Test {

        @Test
        public void testThatTheShortestWordIsLetter_i(){
            String sentence = "Hi, i am kenny";

            String expected = "i";
            String actual = MorningTask1.shortestWordCount(sentence);

            assertEquals(expected, actual);
        }

        @Test
        public void testThatTheShortestWordIsLetter_of(){
            String sentence = "one of them";
            String expected = "of";
            String actual = MorningTask1.shortestWordCount(sentence);
            assertEquals(expected, actual);
        }
    }

