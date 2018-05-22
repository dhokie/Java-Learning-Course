package HowtoSplitaStringinJava;

/**
 * Created by TSI on 5/22/2018.
 */
public class SplitString {

    public static void main(String args[]){
        String myName = "I am Jose Rey Rabadilla Amorganda";
        System.out.println("returning words:");
        for(String w:myName.split("\\s",0)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:myName.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:myName.split("\\s",2)){
            System.out.println(w);
        }

    }

}
