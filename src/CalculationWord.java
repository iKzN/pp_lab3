import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
/**
 * Created by IKZN on 23.03.2015.
 */
public class CalculationWord {
    public static void main( String[] args )
            throws FileNotFoundException, IOException {

       /* List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(new File("C:\\Users\\IKZN\\IdeaProjects\\pp_lab3\\src\\text.txt"));
        while (in.hasNextLine())
            list.add(in.nextLine());
        String[] array = list.toArray(new String[0]);*/

        try(FileReader reader = new FileReader("C:\\Users\\IKZN\\IdeaProjects\\pp_lab3\\src\\text.txt"))
        {
            // читаем посимвольно
            int[] c=new int[500];
            int i=0;
            while((c[i]=reader.read())!=-1){

                System.out.print((char)c[i]);
                i++;
            }
            System.out.print((char)c[i-1]);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
