package userDefinedExceptions;

/**
 * Created by TSI on 5/17/2018.
 */
public class UserDefinedExceptionClass {

    public static void main(String args[]){
        try{
            System.out.println("Starting of try block");
            // I'm throwing the custom exception using throw
            throw new UserDefinedExceptions("This is My Custom error Message");
        }
        catch(UserDefinedExceptions exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }
    }
}
