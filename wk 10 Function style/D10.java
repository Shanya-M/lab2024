import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D10 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "JJ. Jognson", 38));
        students.add(new Student(2, "P. Tibbs", 48));
        students.add(new Student(3, "W. Major", 28));
        students.add(new Student(4, "P. Turner", 60));
        students.add(new Student(5, "A. Ball", 20));
        students.add(new Student(6, "B. Smithy", 90));
        students.add(new Student(7, "R. Jules", 71));
        students.add(new Student(8, "T. Verne", 97));


        // create your Stream solutions here

        //////////////
        // Question 1

        System.out.println("\n=============\nQuestion 1\n=============");

        // Answer for part 1.
        System.out.println("All students");
        students.stream().forEach(System.out::println);

        // Answer for part 2.
        System.out.println("\nStudent with a grade of >70");
        students.stream().filter(s->s.getGrade()>70).forEach(System.out::println);

        // Answer for part 3.
        System.out.println("\nStudent names shown as uppercase and sorted alphabetically");
        Object []  studentArray = students.stream().map(s -> s.getName().toUpperCase()).sorted().toArray();
        System.out.println(Arrays.toString(studentArray));

        // Answer for part 4.
        double aveGrade = students.stream().mapToDouble(s-> s.getGrade()).average().getAsDouble();
        System.out.println("\nAverage grade is " + aveGrade);


        //////////////
        // Question 2

        System.out.println("\n=============\nQuestion 2\n=============");

        // Answer for part 1.
        System.out.println("\nCubes of numbers 90 to 100");
        IntStream.range(90, 101).map(n -> (n * n * n)).forEach(System.out::println);

        // Answer for part 2.
        System.out.println("\nRandom numbers in range 1..5");
        List<Integer> numList = Stream.generate(Math::random).map( n -> (int)(n * 5 + 1)).limit(10).collect(Collectors.toList());

        for(int next : numList)
            System.out.println("Next value is : " + next);

        // Answer for part 3.
        System.out.println("\nRandom numbers in range 1..5 with duplicates removed");
        // note: important to use distinct() after limit(), otherwise will be VERY SLOW!
        List<Integer> numList2 = Stream.generate(Math::random).map( n -> (int)(n * 5 + 1)).limit(10).distinct().collect(Collectors.toList());

        for(int next : numList2)
            System.out.println("Next value is : " + next);
    }
}