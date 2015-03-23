import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserNameChecker {
public static void main(String[] args){
 System.out.println("Results of checking:");
 System.out.println(checkWithRegExp("_@BEST"));
 System.out.println(checkWithRegExp("vovan"));

 System.out.println(checkWithRegExp("Z@OZdfdsfagsgsfgsdgA"));
    System.out.println(checkWithRegExp("Z@OZdfgsdgA"));
    System.out.println(checkWithRegExp("Z@OZdfgsdgA"));
    System.out.println(checkWithRegExp("Z@OZdfgsdgA"));
    System.out.println(checkWithRegExp("Z@OZdfgsdgA"));
  }
 public  static boolean checkWithRegExp(String userNameString){
     Pattern p=Pattern.compile("^[a-z0-9_-]{3,15}$");
     Matcher m=p.matcher(userNameString);
     return m.matches();
 }
}