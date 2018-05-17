package Constructor;

/**
 * Created by TSI on 5/17/2018.
 */
public class ProgrammingLanguage {

        String name;

        ProgrammingLanguage() {
            System.out.println("Constructor method called.");
        }

        ProgrammingLanguage(String language) {
            name = language;
        }

        void setName(String language) {
            name = language;
        }

        void getName() {
            System.out.println("Language name: " + name);
        }
}
