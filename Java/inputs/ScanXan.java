import java.io.*;
import java.util.Scanner;

/**
 * 
 * https://docs.oracle.com/javase/tutorial/essential/io/scanning.html
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            FileReader fr = new FileReader("xanadu.txt");
            s = new Scanner(new BufferedReader(fr));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}