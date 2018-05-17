package StaticVariable;

/**
 * Created by TSI on 5/17/2018.
 */
public class StaticVariable {

    public static void main(String[] args) {
        StaticVariableSample staticVariableSample = new StaticVariableSample();
        StaticVariableSample staticVariableSample2 = new StaticVariableSample();
        StaticVariableSample staticVariableSample3 = new StaticVariableSample();

        staticVariableSample = null;
        staticVariableSample3 = null;

        System.out.println("ID of object 2 is: " + staticVariableSample2.getId());
        System.gc();
    }

}
