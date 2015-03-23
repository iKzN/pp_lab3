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
        boolean pos;
        int pril=0,gl=0,nar=0;
        List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(new File("C:\\Users\\IKZN\\IdeaProjects\\pp_lab3\\src\\text.txt"));
        while (in.hasNextLine())
            list.add(in.nextLine());
        String[] array = list.toArray(new String[0]);

        System.out.println(array[0]);

        String parts[] = array[0].split(" ");

        for(int i=0;i!=parts.length;i++) {
            if ((pos = parts[i].matches("(.*)(ый|ой|ее|ий|его|ему|ого|им|ому)")) != false) {
                pril++;
            }
        }
        for(int i=0;i!=parts.length;i++) {
            if ((pos = parts[i].matches("(.*)(ал|ла|ай|ть|аю|ши|рь|ет)")) != false) {
                gl++;
            }
        }
        for(int i=0;i!=parts.length;i++) {
            if ((pos = parts[i].matches("(.*)(но|ше|ом|ём|ро|нно|ро)")) != false) {
                nar++;
            }
        }
        System.out.println(pril);
        System.out.println(gl);
        System.out.println(nar);
       /* try(FileReader reader = new FileReader("C:\\Users\\IKZN\\IdeaProjects\\pp_lab3\\src\\text.txt"))
        {
            // читаем посимвольно
            int[] c=new int[500];
            int i=0;
            while((c[i]=reader.read())!=-1){

                System.out.print((char)c[i]);
                i++;
            }
            System.out.print((char)c[i-5]);


            for(int j=0;j<=i;j++){
                if(((char)c[i]==' ')&&((char)c[i]==' ')){

                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }*/
    }
}
