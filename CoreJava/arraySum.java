package CoreJava;

public class arraySum {
    public int[] plusOne(int[] digits) {
    
    	int n = digits.length;
    	for(int i=n-1;i>=0;i--)
    	{
    		if(digits[i]<9)
    		{
    			digits[i]=digits[i]+1;
    			return digits;
    		}
    		digits[i]=0;
    	}
    	
    	int[] newArr=new int[n+1];
    	newArr[0]=1;
    	
    	
    return newArr;
        
    }
    
    public static void main(String[] args)
    {
    	arraySum as = new arraySum();
    	int[] digits = {9,9,9,9};
    	int[] newA = as.plusOne(digits);
    	for(int i=0;i<newA.length;i++)
    	{
    		System.out.println(newA[i]);
    	}
    	
    	for(int j:digits)
    	{
    		
    	}
    }
}

