import java.io.*;
import java.util.*;

public class Solution {
    public static int sim(String str,char s,int k){
        int count=0;
        for(int i=0;i<=k-2;i++){
            if(str.charAt(i)==s){
                count=count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int len=Integer.parseInt(obj.nextLine());
        String str1=obj.nextLine();
        int h =Integer.parseInt(obj.nextLine());
        for(int o=0;o<h;o++){
            int x=Integer.parseInt(obj.nextLine());
            System.out.println(sim(str1,str1.charAt(x-1),x));
        }
    }
}