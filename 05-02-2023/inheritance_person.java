import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Person{
    private String fname;
    private String lname;
    Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }
}
class Student extends Person{
    private int id;
    private int scores[];
    Student(String fname,String lname,int id){
        super(fname,lname);
        this.id=id;
    }
    public int getid(){
        return id;  
    }
    public String calculate(int a){
        if(a>=90 && a<=100){
            return "O";
        }
        else if(a>=80 && a<90){
            return "E";
        }
        else if(a>=70 && a<80){
            return "A";
        }
        else if(a>=55 && a<70){
            return "P";
        }
        else if(a>=40 && a<55){
            return "D";
        }
        else{
            return "T";
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fname=in.next();
        String lname=in.next();
        int id=Integer.parseInt(in.next());
        Student obj =new Student(fname,lname,id);
        System.out.println("Name:"+" "+lname+","+" "+fname);
        System.out.println("ID:"+" "+obj.getid());
        int n=Integer.parseInt(in.next());
        int sum=0;
        for(int i=0;i<n*2;i=i+2){
            int v=Integer.parseInt(in.next());
            sum=sum+v;
        }
        int z=sum/n;
        System.out.println("Grade:"+" "+obj.calculate(z));
    }
}