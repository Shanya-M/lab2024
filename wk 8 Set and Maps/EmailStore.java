


import java.util.HashSet;
import java.util.Set;

/**
 * An email storage class
 *
 * @author mdixon
 *
 */
public class EmailStore {

    /**
     * A Set of unqieue email addresses
     */
    private Set<String> emailAddresses = new HashSet<String>();


    /**
     * Adds the given email to the store
     *
     * @param email the emil addr to be added
     * @return true if the email was added, else false
     */
    public boolean addEmail(String email) {

        return emailAddresses.add(email);
    }

    /**
     * Checks if the given email address is currently stored.
     *
     * @param email the email address to be checked.
     * @return true if the email addr is present, else false
     */
    public boolean hasEmail(String email) {

        return emailAddresses.contains(email);
    }

    /**
     * Displays all of the stored emails
     */
    public void displayEmails() {

        System.out.println("\nStored email addresses :\n----------------------\n");

        for(String email : emailAddresses) {
            System.out.println(email);
        }
    }

}