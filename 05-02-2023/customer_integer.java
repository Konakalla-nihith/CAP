import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class IntegerList{
    private int []list;
    private int size;
    private int elementIndex;
    public IntegerList (int size){
        this.size=size;
        list=new int[size];
        this.elementIndex=0;
        
    }
    public void add(int num){
        if(elementIndex<size){
            list[elementIndex]=num;
            elementIndex=elementIndex+1;
        }
        else{
            System.out.println("can't add, list is full");
        }
    }
    public void result(){
        for(int j=0;j<size;j++){
            System.out.println(j+" "+":" + " "+list[j]);
        }
        
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        nums.result();
        
    }
}