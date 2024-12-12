import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Manages a List of names
 *
 * @author mdixon
 *
 */
public class NameManager {

    /**
     * List of stored names.
     */
    private List<String> names = new ArrayList<String>();


    /**
     * Adds a name to the list.
     *
     * @param name the name to be added
     */
    public void addName(String name) {

        names.add(name);
    }

    /**
     * Prints all the names in the list.
     */
    public void printNames() {

        System.out.println("\nNames List is as follows : \n--------------------------\n");

        // iterate over list and print each name
        for(String name : names)
            System.out.println(name);
    }

    /**
     * Removes any names from the list that are more than 15 characters in length.
     */
    public void removeLongNames() {

        Iterator<String> iter = names.iterator();

        // iterate over the list looking for long names
        while (iter.hasNext() ) {
            String name = iter.next();

            if ( name.length() > 15 )
                iter.remove();	// remove using only safe method (while iterating)
        }
    }
}