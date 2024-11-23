package src.problems.climbing_stairs_70;

public class Solution {
  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    Solution solution = new Solution();
    int result = solution.climbingStairs(input);
    System.out.println(result);
    int result2 = solution.climbingStairs2(input);
    System.out.println(result2);
  }

  private int climbingStairs(int n) {
    if (n < 2) {
      return 1;
    }
    return climbingStairs(n - 1) + climbingStairs(n - 2);
  }

  // tabulation to improve dynamic programing reducing overlapping calculations
  private int climbingStairs2(int n) {
    if (n < 2) {
      return n;
    }
    int[] dp = new int[n];
    dp[0] = 1;
    dp[1] = 2;
    for (int i = 2; i < n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n - 1];
  }
}
