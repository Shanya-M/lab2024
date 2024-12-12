/* Algorithm Complexity
Programming Projects:
        1) Max Number Finder
  Start Eclipse and create a new Java project called ‘lab4’
         Create class called NumberChecker
  Add a method with the following signature
int findMax(Integer [] numbers)
  Now implement this method, so that it returns the largest
number within the given numbers array (hint you will need a
        loop and variable called max)
  Write a Driver class which creates an instance of
        NumberChecker then calls the findMax() in order to test. e.g.
        NumberChecker numChecker = new NumberChecker ();
int max = numChecker.findMax(new Integer[] {5,2,7,9,10,1,2});
 System.out.println(“Max number is “ + max);
  Determine the ‘order’ of the implemented method. Express the
time complexity using the Big-O notation.
ANSWER:
/**
 * Finds the maximum number in an array of integer values.
 *
 * The algorithm examines each of the array.
 *
 * If there are n elements in the array,
 * the time complexity of the algorithm is O(n).
 *
 * @param numbers an array of integer numbers to be examined.
 * @return the max number in the array, 0 if the array is empty.
 */
public class Complexity{

int findMax(Integer [] numbers) {
    int max = 0;
    for(int i=0; i < numbers.length; i++) {
        if ( numbers[i] > max)
            max = numbers[i];
    }
    return max;
}

/*2) Number Grid Display

 Create class called NumberGrid
 Add a method with the following signature
void output(int range);
  Now implement this method, so that it outputs a number of rows
and columns (hint use a nested loop) as determined by the
given range value. Each row should display the current row
number (range times).  e.g. if called with the number 2 the
output should be
1 1
        2 2
         Whereas, if called with the number 5 the output should be
1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5
         Determine the ‘growth function’ and ‘order’ of the implemented
method. Express the complexity using the Big-O notation.
/**
 *
 * The outer loop will be executed n times. Inner loop will
 * execute n times.
 * Therefore, the growth function for the code fragment is n*n.
 * That is O(n2).
 *
 * @param range
 */
void output(int range) {
    for(int count=0; count < range; count++) {
        for(int count2=0; count2 < range; count2++) {
            System.out.print("\t" + (count+1));
        }
        System.out.println();
    }
}
}