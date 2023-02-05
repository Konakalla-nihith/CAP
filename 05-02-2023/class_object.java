import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Person{
    int age;
    Person(int age){
        this.age=age;
    }
    void display(){
        if(age<0){
            System.out.println("Age is not valid, setting age to 0.");
            System.out.println("You are young.");
            System.out.println("You are young.");
        }
        else if(age>=0&&age<10){
            System.out.println("You are young.");
            System.out.println("You are young.");
        }
        else if(age>=10&&age<15){
            System.out.println("You are young.");
            System.out.println("You are a teenager.");
        }
        else if(age>=15&&age<18){
            System.out.println("You are a teenager.");
            System.out.println("You are old.");
        }
        else{
            System.out.println("You are old.");
            System.out.println("You are old.");
        }
            
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int n=e.nextInt();
        for(int i=0;i<n;i++){
            int age=e.nextInt();
            Person pi=new Person(age);
            pi.display();
            System.out.println(' ');
        }
    }
}