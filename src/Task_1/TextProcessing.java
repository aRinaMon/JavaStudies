package Task_1;

import opennlp.tools.tokenize.SimpleTokenizer;
import java.util.*;


public class TextProcessing {
    public String[] process(String s) {
        s = s.replaceAll("[^a-zA-Z ]", "").toLowerCase(Locale.ROOT);
        SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;

        return tokenizer.tokenize(s);

    }
}
