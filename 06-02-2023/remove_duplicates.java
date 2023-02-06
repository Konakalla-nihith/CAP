import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        LinkedHashSet<Character>set=new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character ch:set){
            System.out.print(ch);
        }
    }
}