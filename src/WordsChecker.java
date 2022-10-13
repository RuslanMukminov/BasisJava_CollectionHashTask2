import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        set = new HashSet<>(textSplit());
    }

    public Collection<String> textSplit() {
        return List.of(text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
