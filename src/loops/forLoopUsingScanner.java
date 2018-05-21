package loops;

import java.util.Scanner;

/**
 * Created by TSI on 5/21/2018.
 */
public class forLoopUsingScanner {

    public static void main(String[] args){
        int count, temp;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        count = s.nextInt();
        int a[] = new int[count];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < count; i++){
            a[i] = s.nextInt();
        }
        for (int i = 0; i < count; i++){
            for (int j = i + 1; j < count; j++)
            {
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < count - 1; i++){
            System.out.print(a[i] + ",");
        }
        System.out.print(a[count - 1]);
    }

}
