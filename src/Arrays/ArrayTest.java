package Arrays;

/**
 * Created by TSI on 5/10/2018.
 */
public class ArrayTest {

    public static void main(String args[]){
        Integer array[] = new Integer[7];
        for (Integer count=0;count<7;count++){
            array[count]=count+1;
        }
        for (int count=0;count<7;count++){
            System.out.println("array[" + count + "] = " + array[count]);
        }
        System.out.println("Length of Array  =  " + array.length);
    }
}
