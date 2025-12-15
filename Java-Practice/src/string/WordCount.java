package string;
public class WordCount {

    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "  Java   is very easy  ";
        System.out.println("Word count: " + countWords(str));
    }
}

