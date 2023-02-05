import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Shape{
    
     public void area();
     public void peri();
}
class Rectangle implements Shape{
    int l;
    int b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        double area = l*b;
        System.out.printf("%.2f",(double)area);
    }
    public void peri(){
        System.out.printf("%.2f",(double)2*(l+b));
    }
} 
class Square implements Shape {
    int l;
    Square(int l){
        this.l = l;
    }
    public void area(){
        System.out.printf("%.2f",(double)l*l);
    }
    public void peri(){
        System.out.printf("%.2f",(double)(2*(l+l)));
    }
} 
class Circle implements Shape {
    int r;
    Circle(int r){
        this.r = r;
    }
    public void area(){
        System.out.printf("%.2f",(22.0/7)*r*r);
    }
    public void peri(){
        System.out.printf("%.2f",2*(22.0/7)*r);
    }
}
public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
        for(int i =0;i<n;i++){
            String [] arr = in.nextLine().split(" ");
            if(arr[0].equals("R")){
                Rectangle R = new Rectangle(Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
                R.area();
                System.out.print(" ");
                R.peri();
                System.out.println();
            }
            else if(arr[0].equals("S")){
                Square S = new Square(Integer.parseInt(arr[1]));
                S.area();
                System.out.print(" ");
                S.peri();
                System.out.println();
            }
            else if ( arr[0].equals("C")){
                Circle C = new Circle(Integer.parseInt(arr[1]));
                C.area();
                System.out.print(" ");
                C.peri();
                System.out.println();
            }
        }
    }
}