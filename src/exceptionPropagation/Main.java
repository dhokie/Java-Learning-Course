package exceptionPropagation;

/**
 * Created by TSI on 5/17/2018.
 */
public class Main {

    public static void main(String args[]){

        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();

        exceptionPropagation.catchException();
        System.out.println("normal flow...");
    }
}
