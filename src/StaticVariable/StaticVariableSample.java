package StaticVariable;

/**
 * Created by TSI on 5/17/2018.
 */
public class StaticVariableSample {

    // Set count to zero initially.
    static int count = 0;

    // Use this to store an ID for each object.
    int id;

    public StaticVariableSample() {

        // Every time the constructor runs, increment count.
        count = count + 1;

        // Set the object ID using count.
        id = count;

        // Now count can change but id will be unaffected.
    }

    // This just returns the ID.
    public int getId() {
        return id;
    }

    public void finalize(){
        System.out.println("Garbage Collected");
    }
}
