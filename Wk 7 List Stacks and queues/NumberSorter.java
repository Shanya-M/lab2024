import java.util.Stack;

/**
 * A simple number sorter based on the use of two stacks.
 *
 * @author mdixon
 */
public class NumberSorter {

    /**
     * Sorts the given array of integers into order, then outputs to the console.
     *
     * @param numbers the numbers to be sorted and output.
     * @param ascending a flag that indicates whether to sort into ascending or descending order
     */
    void sort(int[] numbers, boolean ascending) {

        // The source stack, to which the numbers are popped
        Stack<Integer> srcStack = new Stack<Integer>();

        // The dest stack, from which the numbers are pushed
        Stack<Integer> destStack = new Stack<Integer>();

        // Add the initial array of numbers to the source stack.
        for (int number : numbers)
            srcStack.push(number);

        // Iterate while the source stack still contains number
        while (!srcStack.isEmpty()) {

            int next = srcStack.pop();

            // Pop values from the dest stack which are greater (if ascending) or less than (if descending) than the next number,
            // and push these back onto the source stack
            while (!destStack.isEmpty() && ((ascending && destStack.peek() > next) || (!ascending && destStack.peek() < next)))
                srcStack.push(destStack.pop());

            // push the next number to the dest stack (once all greater values have been popped).
            destStack.push(next);
        }

        // Print the contents of the dest stack (which now will be ordered).
        System.out.print("Sorted: ");

        for (int number : destStack)
            System.out.print(number + " ");

        System.out.println();
    }

}
