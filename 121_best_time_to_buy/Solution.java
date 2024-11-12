public class Solution {
  public static void main(String[] args) {
    int[] prices = new int[args.length];
    for (int i = 0; i < prices.length; i++) {
      prices[i] = Integer.parseInt(args[i]);
    }
    Solution solution = new Solution();
    int maxProfit = solution.maxProfit(prices);
    System.out.println(maxProfit);
    int maxProfit2 = solution.maxProfit2(prices);
    System.out.println(maxProfit2);
  }

  private int maxProfit(int[] prices) {
    int maxDiff = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int diff = prices[j] - prices[i];
        if (diff > maxDiff) {
          maxDiff = diff;
        }
      }
    }
    return maxDiff;
  }

  // kadane algorithm
  private int maxProfit2(int[] prices) {
    int buy = prices[0];
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      } else if (prices[i] - buy > profit) {
        profit = prices[i] - buy;
      }
    }
    return profit;
  }
}
