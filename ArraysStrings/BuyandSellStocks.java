package ArraysStrings;

public class BuyandSellStocks {
    public static void main(String[] args) {
        int[] arr={4,0,2,6,3,7};
        buyAndSellStocks(arr);
    }

    private static void buyAndSellStocks(int[] arr) {
        int buy =arr[0];
        int sell=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<buy)
            {
                buy=arr[i];
            }
            if(arr[i]>sell)
            {
                sell=arr[i];
            }
        }
        profit=sell-buy;
        System.out.println("buy at price : "+buy);
        System.out.println("Sell at Price : "+sell);
        System.out.println("profit : "+ profit);
    }
    
}
