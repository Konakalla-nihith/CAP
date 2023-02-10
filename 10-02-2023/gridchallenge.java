import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */
    
    public static String sort(String s){
        char[] ch= s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static String gridChallenge(List<String> grid) {
    // Write your code here
        List<String> a= new ArrayList<>();
        for(int i=0;i<grid.size();i++){
            String s= sort(grid.get(i));
            a.add(s);
        }
        int x=a.get(0).length();
        for(int i=1;i<a.size();i++){
            for(int j=0;j<x;j++){
                if(a.get(i-1).charAt(j)>a.get(i).charAt(j))
                    return "NO";
            }
        }
         return "YES";

    }
   
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> grid = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String gridItem = bufferedReader.readLine();
                grid.add(gridItem);
            }

            String result = Result.gridChallenge(grid);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
