package day_04_01_2022;

public class FindIndexOfGivenWorldInSentence {

    public static void main(String[] args) {
        String sentence = " Java is my job because i am SDET";
        String word = "SDET";
        int index = findIndexOfGivenWorld(sentence, word);
        System.out.println(word);
    }

    private static int findIndexOfGivenWorld(String sentence, String word) {
        String[] words = sentence.split("");
        int counter =0;
        for (String each: words) {
            counter++;
            if (each.equals(word)){
                break;
            }

        }
        return counter;
    }
}