import java.io.*;
import java.util.*;

public class Solution {
    public static int Fibonacci(int count){ 
    int[] num=new int[count];
    int n1=-1,n2=1,n3=0;
    for(int i=0;i<count;i++){
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;
         num[i]=n3; 
     }
    }
        return num[count/2];
 }    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        if(n%2!=0){
            System.out.println(n);
        }
        else{
            System.out.println(Fibonacci(n));
        }
    }
}