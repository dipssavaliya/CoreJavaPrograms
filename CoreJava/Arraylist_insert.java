package CoreJava;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist_insert {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      System.out.print("Enter line for arraylist");
    	Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<line;i++)
        {
            l.add(sc.nextInt());
        }
        System.out.print("Enter query for arraylist");
        int queryList = sc.nextInt();
        for(int i=0;i<queryList;i++)
        {
        	sc.nextLine();
        	System.out.print("Enter operation for arraylist");
            String s = sc.nextLine();
          
            if(s.equalsIgnoreCase("Insert"))
            {
                int indx = sc.nextInt();
                int elm = sc.nextInt();
                l.add(indx, elm);
          
            }
            if(s.equalsIgnoreCase("Delete"))
            {
                int ind=sc.nextInt();
                l.remove(ind);
            }
            
        }
         // l.stream().forEach(i->System.out.print(i+" ")); 
          for(int i =0;i<l.size();i++)
          {
              System.out.print(l.get(i)+" ");
          }
    }
}

