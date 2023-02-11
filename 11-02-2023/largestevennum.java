import java.io.*;
import java.util.*;

public class Solution {
   

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(arr.contains(Integer.parseInt(s.charAt(i)+""))){
                    continue;
                }
                arr.add(Integer.parseInt(s.charAt(i)+""));
            }
        }
        Collections.sort(arr);
        String res="";
        int min=99999;
        int flag=0;
        for(int k:arr){
            if(k%2==0) flag=1;
        }
        for(int i: arr){
            if(i%2==0){
                if(min>i)
                min=i;
                break;
            }
        }
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)!=min){
                res=res+arr.get(i);
            }
        }
        res=res+min;
        if(flag==0){
            System.out.println(-1);
        }
        else{
            System.out.println(res);
        }
    }
}