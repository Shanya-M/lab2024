import java.util.Arrays;

/**
 * A class that calculates various statistical information from a list of numeric values.
 *
 * @author mdixon
 */
public class Stats {

    /**
     * An array which stores the list of numeric values
     */
    private int[] numbers;

    /**
     * The number of values currently stored within the {@link #numbers} array.
     */
    private int count;


    /**
     * Adds a new value to the list
     *
     * @param value the value to be added
     */
    public void addValue(int value) {

        // add the given value to the array
        numbers[count] = value;

        // then increment the count
        count++;
    }

    /**
     * Gets the number of values currently stored.
     *
     * @return the number of values currently stored
     */
    public int getCount() {

        return numbers.length;	// BUG: should return 'count' according to comment
    }

    /**
     * Finds the maximum value.
     *
     * @return the maximum of all stored values
     */
    public int getMax() {

        int max = numbers[0];	// start with first value

        // find the highest value within the remaining elements of the array
        for (int i = 1; i < numbers.length; i++) {	// BUG: should return i < 'count'

            if (numbers[i] > max)
                max = numbers[i];
        }

        return max;
    }

    /**
     * Finds the minimum value.
     *
     * @return the minimum of all stored values
     */
    public int getMin() {

        int min = numbers[0]; // start with first value

        // find the lowest value within the remaining elements of the array
        for (int i = 1; i < numbers.length; i++) {	// BUG: should return i < 'count'

            if (numbers[i] < min)
                min = numbers[i];
        }

        return min;
    }

    /**
     * Calculates the total of all stored values.
     *
     * @return the total of all the stored values
     */
    public int getTotal() {

        int total = 0;

        // total all values within the array
        for (int i = 0; i < numbers.length; i++) {	// BUG: should return i < 'count'
            total += numbers[i];
        }

        return total;
    }

    /**
     * Calculates the average of all stored values.
     *
     * @return the average of all the stored values
     */
    public double getAverage() {

        int total = 0;

        // total all values within the array
        for (int i = 0; i < numbers.length; i++) {	// BUG: should return i < 'count'
            total += numbers[i];
        }

        // then divide by the number of elements to calculate the average

        double average = total/(double)numbers.length;	// BUG: should use 'count'

        return average;
    }

    @Override
    public String toString() {

        return Arrays.toString(numbers);
    }

    /**
     * Constructor
     *
     * @param capacity the maximum number of values allowed
     */
    public Stats(int capacity) {

        numbers = new int[capacity];
    }

}
