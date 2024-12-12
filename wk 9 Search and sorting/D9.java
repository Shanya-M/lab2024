
/**
 *
 * Driver class.
 *
 * @author mdixon
 *
 */
public class D9 {

    public static void main(String[] args) {

        Census c = new Census();

        c.addPerson(new Person(170, 40, true));
        c.addPerson(new Person(160, 30, true));
        c.addPerson(new Person(150, 20, false));
        c.addPerson(new Person(190, 90, true));
        c.addPerson(new Person(172, 42, true));
        c.addPerson(new Person(173, 46, false));
        c.addPerson(new Person(170, 52, false));
        c.addPerson(new Person(162, 60, true));
        c.addPerson(new Person(174, 61, false));

        System.out.println(c);

        c.sortOnAge();
        System.out.println(c);

        c.sortOnHeight();
        System.out.println(c);

        c.sortOnGender();
        System.out.println(c);
    }

}
