package exceptionPropagation;

/**
 * Created by TSI on 5/17/2018.
 */
public class ExceptionPropagation {

    void method1(){
        int data=50/0;
    }
    void method2(){
        method1();
    }
    void catchException(){
        try{
            method2();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
}
