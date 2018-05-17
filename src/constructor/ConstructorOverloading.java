package constructor;

/**
 * Created by TSI on 5/17/2018.
 */
public class ConstructorOverloading {

    public static void main(String[] args) {
        ProgrammingLanguage cpp  = new ProgrammingLanguage();
        ProgrammingLanguage java = new ProgrammingLanguage("Java");

        cpp.setName("C++");

        cpp.getName();
        java.getName();

    }

}
