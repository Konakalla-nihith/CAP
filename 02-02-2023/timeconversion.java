import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        char a=s.charAt(s.length()-2);
        s=s.substring(0,s.length()-2);
        if(a=='A'){
            int h=Integer.parseInt(s.substring(0,2));
        if(h==12){
           h=0; 
        }
        String s1 = Integer.toString(h);
            if (s1.length() == 1) {
                s1 = "0" + s1;
            }
            return s1 + s.substring(2, s.length());
        }
        else{
            int h=Integer.parseInt(s.substring(0,2));
            if(h!=12){
                h+=12;
            }
            String s1 = Integer.toString(h);
            if (s1.length() == 1) {
                s1 = "0" + s1;
            }
            return s1 + s.substring(2, s.length());
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
