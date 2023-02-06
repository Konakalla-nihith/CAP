//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
        HashMap<String,Integer> book= new HashMap<String , Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            book.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            try{
                int phn=book.get(s);
                System.out.println(s+"="+phn);
            }
            catch(Exception e){
                System.out.println("Not found");
            }
		}
	}
}



