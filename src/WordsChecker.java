import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public Collection<String> textSplit() {
        return List.of(text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>(textSplit());
        return set.contains(word);
    }
}
