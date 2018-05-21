package loops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TSI on 5/21/2018.
 */
public class SwitchCase {

    public static void main(String[] args) {
        ArrayList<String> futureMonths = new ArrayList<String>();

        int monthNumber;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter month:");
        monthNumber = s.nextInt();

        switch (monthNumber) {
            case 1:
                futureMonths.add("January");
                break;
            case 2:
                futureMonths.add("February");
                break;
            case 3:
                futureMonths.add("March");
                break;
            case 4:
                futureMonths.add("April");
                break;
            case 5:
                futureMonths.add("May");
                break;
            case 6:
                futureMonths.add("June");
                break;
            case 7:
                futureMonths.add("July");
                break;
            case 8:
                futureMonths.add("August");
                break;
            case 9:
                futureMonths.add("September");
                break;
            case 10:
                futureMonths.add("October");
                break;
            case 11:
                futureMonths.add("November");
                break;
            case 12:
                futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthNumber + " is equal to " + monthName);
            }
        }
    }
}
