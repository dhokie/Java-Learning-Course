package bufferredReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by TSI on 5/22/2018.
 */
public class ReadFile {

    public static void main(String[] args) {
        BufferedReader objReader = null;
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("D:\\DhokieMents\\Backup files\\Documentation\\sample.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {

                System.out.println(strCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
