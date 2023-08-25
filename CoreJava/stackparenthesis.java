package com.example.demo;


import java.util.*;
class stackparenthesis{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            boolean test = isParenthesisMatch(sc.nextLine());
            System.out.println(test);
        }
       
		
	}
    static boolean isParenthesisMatch(String input)
    {
        
            //Complete the code
            Stack<Character> stack = new Stack<>();
            
            for(int i =0;i<input.length();i++)
            {
                char ch = input.charAt(i);
               
                if(isOpening(ch))
                {
                    stack.push(ch);
                   
                }
                else{
                    if(stack.isEmpty())
                    return false;
                    else if(!isMatching(stack.peek(), ch))
                    {
                        return false;
                    }
                else
                {
                    stack.pop();
                }
                }
            }
            return stack.isEmpty();
        }
        
    
    static boolean isMatching(char a, char b)
        {
            return (a=='{' && b=='}') || (a=='(' && b==')')||(a=='[' && b==']');
        }
        
    static boolean isOpening(char a)
    {
        return a=='(' || a=='{' || a=='[';
    }
        
}



