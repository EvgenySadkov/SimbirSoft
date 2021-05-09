import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.simbirsoft.com/";
        Map<String, Integer> counterMapWords = new HashMap<>();
        counterMapWords = new Parser().getTextPage(url);
        for (String word : counterMapWords.keySet()) {
            System.out.println(word + " - " + counterMapWords.get(word));
        }
    }
}

