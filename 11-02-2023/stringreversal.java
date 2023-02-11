import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(char arr[]){
        int r=arr.length-1;
        int l=0;
        while(l<r){
            if(!Character.isAlphabetic(arr[l])){
                l++;
            }
            else if(!Character.isAlphabetic(arr[r])){
                r--;
            }
            else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char[] arr=s.toCharArray();
        reverse(arr);
        String revstr=new String(arr);
        System.out.println(revstr);
    }
}