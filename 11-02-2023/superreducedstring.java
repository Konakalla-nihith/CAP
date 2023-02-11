import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
        Stack<Character> ar=new Stack<>();
        for(char c:s.toCharArray()){
            if(ar.isEmpty()){
                ar.push(c);
            }
            else if(c==ar.peek()){
                ar.pop();
            }
            else{
                ar.push(c);
            }
        }
        StringBuilder s1=new StringBuilder();
        for(char a:ar){
            s1.append(a);
        }
        if(s1.length()==0){
            return "Empty String";
        }
        else{
            return s1.toString();
        }
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
