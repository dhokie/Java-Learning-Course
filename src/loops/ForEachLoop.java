package loops;


import java.util.Arrays;
import java.util.Scanner;

import static loops.MaximumMinimum.maximum;
import static loops.MaximumMinimum.minimum;

/**
 * Created by TSI on 5/21/2018.
 */
public class ForEachLoop {

    public static void main(String[] arg) {
        {
            int[] marks = {125, 132, 95, 116, 110, 138, 143};

            int highest_marks = maximum(marks);
            int lowest_marks = minimum(marks);

            System.out.println("=========================");
            System.out.println("enhance for loop: Not Sorted");
            for (int mark : marks) {
                System.out.println(mark);
            }

            System.out.println("=========================");
            System.out.println("traditional for loop: Sorted");
            Arrays.sort(marks);
            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
            }

            System.out.println("=========================");
            System.out.println("Array count: " + marks.length);
            System.out.println("The highest score is " + highest_marks);
            System.out.println("The highest score is " + lowest_marks);
        }

    }

}
