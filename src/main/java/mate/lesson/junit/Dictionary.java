package mate.lesson.junit;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        int max = Integer.MIN_VALUE;
        String result = null;
        for (String word : words) {
            int count = 0;
            int nextIndex = 0;
            String[] letters = word.split("");
            for (String letter : letters) {
                if (to.indexOf(letter, nextIndex) > -1) {
                    count++;
                    nextIndex = to.indexOf(letter, nextIndex);
                } else {
                    count--;
                }
            }
            if (count > max) {
                max = count;
                result = word;
            }
        }
        return result;
    }
}