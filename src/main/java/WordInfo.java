public class WordInfo {
    private String word;
    private int wordCount;

    public WordInfo(String value, int wordCount) {
        this.word = value;
        this.wordCount = wordCount;
    }

    public String getWord() {
        return this.word;
    }

    public int getWordCount() {
        return this.wordCount;
    }
}
