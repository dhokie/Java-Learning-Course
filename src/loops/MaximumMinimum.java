package loops;

import org.jetbrains.annotations.Contract;

/**
 * Created by TSI on 5/21/2018.
 */
public class MaximumMinimum {

    @Contract(pure = true)
    public static int maximum(int[] numbers){

        int maxSoFar = numbers[0];

        // for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxSoFar){
                maxSoFar = numbers[i];
            }
        }

        return maxSoFar;
    }

    @Contract(pure = true)
    public static int minimum(int[] numbers){

        int minSoFar = numbers[0];

        // for each loop
        for (int number : numbers){
            if (number < minSoFar){
                minSoFar = number;
            }
        }
        return minSoFar;
    }
}
