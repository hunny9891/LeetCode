package com.leetcode;

/**
 * @author Himanshu
 *
 */
public class BuySellStock {
	/*public int maxProfit(int[] prices) {
		if (prices == null) throw new IllegalArgumentException();
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (i != prices.length - 1) {
				for (int j = i + 1; j < prices.length; j++) {
					if (prices[i] < prices[j] && profit < prices[j] - prices[i])
						profit = prices[j] - prices[i];
				}
			}
		}
		return profit;
	}
	*/
	
	public int maxProfit(int[] prices) {
		if(prices.length  <=1) return 0;
		
		int minElem = prices[0];
		int maxDiff = prices[1] - prices[0];
		for(int i=0;i<prices.length;i++) {
			if(prices[i] - minElem > maxDiff )
				maxDiff = prices[i] - minElem;
			if(prices[i] < minElem) {
				minElem = prices[i];
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		BuySellStock stock = new BuySellStock();
		int[] x = {9,3,4,1,2,7,6,8};
		System.out.println(stock.maxProfit(x));
	}

}
