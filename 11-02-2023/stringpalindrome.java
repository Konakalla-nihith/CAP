import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        String rs="";
        for(int i=(s.length()-1);i>=0;i--){
            rs+=s.charAt(i);
        }
        if(rs.toLowerCase().equals(s.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}