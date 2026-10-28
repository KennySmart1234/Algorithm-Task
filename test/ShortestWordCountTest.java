import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class ShortestWordCountTest {

        @Test
        public void testThatTheShortestWordIsLetter_i(){
            String sentence = "Hi, i am kenny";

            String expected = "i";
            String actual = ShortestWordCount.shortestWordCount(sentence);

            assertEquals(expected, actual);
        }

        @Test
        public void testThatTheShortestWordIsLetter_of(){
            String sentence = "one of them";
            String expected = "of";
            String actual = ShortestWordCount.shortestWordCount(sentence);
            assertEquals(expected, actual);
        }


        @Test
        public void testThatTheShortestWordIsLetter_to(){
            String sentence = "Always to win";
            String expected = "to";
            String actual = ShortestWordCount.shortestWordCount(sentence);
            assertEquals(expected, actual);
        }
    }

