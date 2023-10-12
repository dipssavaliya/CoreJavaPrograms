package CoreJava;

import java.math.BigDecimal;
import java.util.*;
class solutionn{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+1];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        String temp="";
        //Write your code here
        
       for(int i=0;i<n;i++){
           if(s[i].compareTo(s[i+1])>0)
           {
               temp=s[i];
               s[i]=s[i+1];
               s[i+1]=temp;
           }
          
       }
        
        
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}