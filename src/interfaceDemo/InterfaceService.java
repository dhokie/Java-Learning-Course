package interfaceDemo;

/**
 * Created by TSI on 5/17/2018.
 */
public class InterfaceService implements InterfaceImpl {


    @Override
    public void firstMethod() {
        System.out.print("This is the first method");
    }

    @Override
    public void secondMethod() {
        System.out.print("This is the second method");
    }
}
