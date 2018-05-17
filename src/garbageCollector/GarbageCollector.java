package garbageCollector;

/**
 * Created by TSI on 5/17/2018.
 */
public class GarbageCollector {

    public void finalize(){
        System.out.println("Garbage Collected");
    }
    public static void main(String args[]){
        GarbageCollector garbageCollector = new GarbageCollector();
        GarbageCollector garbageCollector1= new GarbageCollector();
        garbageCollector = null;
        garbageCollector1 = null;
        System.gc();

        /**
         * Runs the finalization methods of any objects pending finalization.
         * <p>
         * Calling this method suggests that the Java Virtual Machine expend
         * effort toward running the <code>finalize</code> methods of objects
         * that have been found to be discarded but whose <code>finalize</code>
         * methods have not yet been run. When control returns from the
         * method call, the Java Virtual Machine has made a best effort to
         * complete all outstanding finalizations.
         * <p>
         */
    }

}
