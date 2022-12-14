package onboarding;

public class Problem4 {
    public static String solution(String word) {
        return getOppositeWord(word);
    }
    private static String getOppositeWord(String word) {
        StringBuilder oppositeWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i)))
                oppositeWord.append(word.charAt(i));
            if (Character.isUpperCase(word.charAt(i)))
                oppositeWord.append((char) ('Z' - word.charAt(i) + 'A'));
            if (Character.isLowerCase(word.charAt(i)))
                oppositeWord.append((char)('z' - word.charAt(i) + 'a'));
        }
        return oppositeWord.toString();
    }
}
