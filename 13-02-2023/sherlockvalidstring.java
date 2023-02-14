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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    Map<Character,Integer> cmap=new HashMap<>();
    char [] sarr=s.toCharArray();
    for(int i=0;i<sarr.length;i++){
        if(cmap.containsKey(sarr[i])){
            int n=cmap.get(sarr[i])+1;
            cmap.put(sarr[i],n);
        }
        else{
            cmap.put(sarr[i],1);
        }
    }
    int[] arr=new int[cmap.size()];
    int id=0;
    for(Map.Entry<Character,Integer> map:cmap.entrySet()){
        arr[id++]=map.getValue();
    }
    Arrays.sort(arr);
    if(arr.length==1){
        return "YES";
    }
    int f=arr[0];
    int l=arr[arr.length-1];
    int sec=arr[1];
    int secl=arr[arr.length-2];
    if(f==l){
        return "YES";
    }
    else if(f==1 && sec==l){
        return "YES";
    }
    else if(f==sec&&sec==secl&&secl==l-1){
        return "YES";
    }
    else{
        return "NO";
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
