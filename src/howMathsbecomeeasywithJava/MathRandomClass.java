package howMathsbecomeeasywithJava;

/**
 * Created by TSI on 5/21/2018.
 */
public class MathRandomClass {

    public static void main(String[] args) {

        double x = Math.random();

        System.out.println("Double between 0.0 and 1.0: x = "+x);

        double y = Math.random()*20.0;

        System.out.println("Double between 0.0 and 20.0: y = "+y);

        int r1 = (int) (Math.random()*5)+3;

        System.out.println("Integer between 3 and 8: r1 = "+r1);

        int r2 = (int) (Math.random()*20)-10;

        System.out.println("Integer between -10 and 10: r2 = "+r2);

    }

}
