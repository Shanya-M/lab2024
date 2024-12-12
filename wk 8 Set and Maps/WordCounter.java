import java.util.HashMap;
import java.util.Map;

/**
 * Unique Word counter solution.
 *
 * @author mdixon
 */
public class WordCounter {

    /**
     * Maps words to their occurrence count.
     */
    private final Map<String, Integer> wordMap = new HashMap<String, Integer>();

    /**
     * Adds the given word to the occurrence count map.
     *
     * @param word
     */
    private void addWord(String word) {

        if ( wordMap.containsKey(word) ) {

            wordMap.put(word, wordMap.get(word) + 1);
        }
        else {

            wordMap.put(word, 1);
        }
    }

    /**
     * Adds each word in the given sentence to the occurrence count map.
     *
     * @param sentence
     */
    public void addSentence(String sentence) {

        for(String word : sentence.split(" ")) {

            addWord(word);
        }
    }

    /**
     * Outputs the results of the word count.
     */
    public void outputResults() {

        for (String word : wordMap.keySet() ) {

            System.out.println(word + " : " + wordMap.get(word));
        }
    }


}
