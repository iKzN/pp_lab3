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

        boolean pos;        //переменная реагирующая на наличие подслова
        int pril=0;         //количество прилагательных
        int gl=0;           //количество глаголов
        int nar=0;          //количство наречий

        List<String> list = new ArrayList<String>();        //создаем набор стринговских переменных
        Scanner in = new Scanner(new File("C:\\Users\\IKZN\\IdeaProjects\\pp_lab3\\src\\text.txt")); //открываем файл

        while (in.hasNextLine())                            //читаем
            list.add(in.nextLine());

        String[] array = list.toArray(new String[0]);       //создаем массив стринговских переменных



        String alltext=array[0];

        for(int i=1;i!=array.length;i++) {
            alltext=alltext+" "+array[i];
        }

        System.out.println(alltext);                       //выводим текст

        String parts[] = alltext.split(" ");               //разбиваем его на слова

        for(int i=0;i!=parts.length;i++) {                  //ищем прилагательные по окончаниям
            if ((pos = parts[i].matches("(.*)(ый|ой|ее|ий|его|ему|ого|им|ому|ых|ые|яя|ая)[,.!?;:()]{0,1}")) != false) {
                pril++;
                System.out.println(i);
                System.out.println(parts[i]);
            }
        }
        for(int i=0;i!=parts.length;i++) {                  //ищем глаголы
            if ((pos = parts[i].matches("(.*)(ал|ла|ай|ть|аю|ши|рь|ет|шь)")) != false) {
                gl++;

            }
        }
        for(int i=0;i!=parts.length;i++) {                  //ищем наречия
            if ((pos = parts[i].matches("(.*)(но|ше|ом|ём|ро|нно|ро|ва).*")) != false) {
                nar++;
            }
        }

        //выводим все
        System.out.println("    Количество слов:");
        System.out.println(parts.length);
        System.out.println("    Количество прилагательных:");
        System.out.println(pril);
        System.out.println("    Количество глаголов:");
        System.out.println(gl);
        System.out.println("    Количество наречий:");
        System.out.println(nar);


    }
}
