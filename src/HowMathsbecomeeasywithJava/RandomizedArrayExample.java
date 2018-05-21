package HowMathsbecomeeasywithJava;

import java.util.Random;

/**
 * Created by TSI on 5/21/2018.
 */
public class RandomizedArrayExample {

    public static int[] myNumbers = null;
    public static void main(String[] args)
    {
        try
        {
            myNumbers = new int[6];
            System.out.println(" my initial values ");
            for (int i = 0; i < myNumbers.length; i++) {
                System.out.println(myNumbers[i]);
            }
            Random random = new Random();
            int totalElementsCount = 0;
            boolean loopStatus = true;
            while(loopStatus)
            {
                int next_num = random.nextInt(42)+1;
                if(!isCompleted()){
                    if(!isDuplicate(next_num)){
                        myNumbers[totalElementsCount] = next_num;
                        totalElementsCount++;
                    }else{
                        continue;
                    }
                }else{
                    loopStatus = false;
                }
            }
            System.out.println("-------- my final values -------------");
            for (int i = 0; i < myNumbers.length; i++) {
                System.out.println(myNumbers[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean isCompleted(){
        boolean status = true;
        for (int i = 0; i < myNumbers.length; i++){
            if(myNumbers[i]==0){
                status = false;
                break;
            }
        }
        return  status;
    }
    public static boolean isDuplicate(int num){
        boolean status = false;
        for (int i = 0; i < myNumbers.length; i++){
            if(myNumbers[i]== num){
                status = true;
                break;
            }
        }
        return  status;
    }

}
