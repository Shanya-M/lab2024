
/**
 * Simple Driver to test the {@link EmailStore} class and {@link WordCounter} class.
 *
 * @author mdixon
 *
 */
public class D8 {

    public static void main(String[] args) {

        // Test the EmailStore
        EmailStore store = new EmailStore();

        store.addEmail("test@test.com");
        store.addEmail("test2@test.com");
        store.addEmail("test3@test.com");
        store.addEmail("test4@test.com");


        store.displayEmails();

        if ( !store.addEmail("test@test.com") )
            System.out.println("Duplicate not added");

        store.displayEmails();

        if ( store.hasEmail("test2@test.com") )
            System.out.println("Found existing email : test2@test.com");


        // Test the WordCounter
        WordCounter wc = new WordCounter();

        wc.addSentence("The simplest pancake sorting algorithm requires at most 2n-3 flips. In this algorithm, a variation of selection sort, we bring the largest pancake not yet sorted to the top with one flip, and then take it down to its final position with one more, then repeat this for the remaining pancakes. Note that we do not count the time needed to find the largest pancake, only the number of flips; if we wished to create a real machine to execute this algorithm in linear time, it would have to both perform prefix reversal (flips) and be able to find the maximum of a range of consecutive numbers in constant time.");

        wc.outputResults();
    }

}
