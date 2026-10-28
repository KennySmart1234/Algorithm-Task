public class MorningTask1 {

    public static String shortestWordCount(String sentence) {
        String[] words = sentence.trim().split("\\s+");

        String shortest = words[0];
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortest.length()  ) {
                shortest = words[i];
            } }

        return shortest;

        }

    public static void  main(String[] args) {
        System.out.print(shortestWordCount("i, My name is Kenny"));
    }
}
