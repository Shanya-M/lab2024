import java.util.Random;

/**
 * A driver class which tests the {@link Stats} class methods.
 *
 * @author mdixon
 *
 */
public class D3 {

    /**
     * Main method. Start of program execution.
     *
     * @param args
     */
    public static void main(String[] args) {

        // A constant which defines the number of values to be added
        final int VALUES = 10;

        // Create a new Stats instance
        Stats stats = new Stats(VALUES);

        // Generate a number of values and add to the Stats instance
        Random random = new Random();

        for (int i = 0; i < VALUES; i++) {

            stats.addValue(random.nextInt(100));
        }

        // Output information allowing the methods to be tested
        System.out.println("Numbers stored : ");
        System.out.println(stats);

        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMin());
        System.out.println("Maximum value = " + stats.getMax());
    }

}
