package userDefinedExceptions;

/**
 * Created by TSI on 5/17/2018.
 */
public class UserDefinedExceptions extends Exception{

    String exception;
    /* constructor of custom exception class
     * here I am copying the message that we are passing while
     * throwing the exception to a string and then displaying
     * that string along with the message.
     */
    UserDefinedExceptions(String exception2) {
        exception=exception2;
    }
    public String toString(){
        return ("MyException Occurred: " + exception) ;
    }
}
