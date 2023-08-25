package ArraysStrings;

public class maxProfit {
	
	public static void main(String[] args)
	{
		int ans = maxProfit(new int[] {7,1,5,3,6,4});
	}
	//sliding window problem
	 public static int maxProfit(int[] prices) {
	       int buyPrice = Integer.MAX_VALUE;
	       int sellingPrice =0;
	       int profit=0;
	       for(int i=0;i<prices.length;i++)
	       {
	    	if(buyPrice>prices[i])
	    	{
	    		buyPrice=prices[i];//1
	    	}
	    	profit=prices[i]-buyPrice; //1-1   7-7=0
	    			
	    	if(sellingPrice<profit)//7<0
	    	{
	    		sellingPrice=profit;
	    	}
	    	
	       }
	        return sellingPrice;
	    }
}
