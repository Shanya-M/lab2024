import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Census class, manages a list of {@link Person} instances.
 *
 * @author mdixon
 */
public class Census {

    /**
     * The list of people.
     */
    private final List<Person> people = new ArrayList<Person>();

    /**
     * Adds a person to the census.
     *
     * @param person
     */
    void addPerson(Person person) {

        people.add(person);
    }

    /**
     * Removes a person from the census.
     *
     * @param person
     * @return true if the peron was removed, false if not in the cesnsus.
     */
    boolean removePerson(Person person) {
        return people.remove(person);
    }

    /**
     *
     * @return the count of all people in the census.
     */
    int countPeople() {

        return people.size();
    }

    /**
     *
     * @return the count of all males in the census.
     */
    int countMales() {

        int count = 0;

        for (Person person : people) {

            if (person.isMale())
                count++;
        }
        return count;
    }

    /**
     *
     * @return the count of all females in the census.
     */
    int countFemales() {

        return countPeople() - countMales();
    }

    /**
     * Sorts the people in the census based on their age.
     */
    void sortOnAge() {
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
    }

    /**
     * Sorts the people in the census based on their height.
     */
    void sortOnHeight() {
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getHeight(), p2.getHeight());
            }
        });
    }

    /**
     * Sorts the people in the census based on their gender.
     */
    void sortOnGender() {
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return Boolean.compare(p1.isMale(), p2.isMale());
            }
        });
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();

        buffer.append("People in census\n");
        buffer.append("----------------\n");

        for (Person person : people) {

            buffer.append(person);
            buffer.append("\n");
        }

        buffer.append("----------------\n");

        return buffer.toString();
    }
}
