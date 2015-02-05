public class BestTimetoBuyandSellStock {




    /*
    Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
    */

	 // idea is to found the so far min price
	 public int maxProfit(int[] prices) {
		 if (prices.length == 0) {
			 return 0 ;
		 }
		 
		 int max = 0 ;
		 int sofarMin = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if (prices[i] > sofarMin) {
	    		 max = Math.max(max, prices[i] - sofarMin) ;
	    	 } else{
	    		sofarMin = prices[i];  
	    	 }
	     }	     
	    return  max ;
	 }
	 
	 
}
