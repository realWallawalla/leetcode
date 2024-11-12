import ConvertInputUtil;
import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    Convert int[] nums = new int[args.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    Solution solution = new Solution();
    int maxProfit = solution.numArray(nums);
  }

  private int numArray(int[] nums) { return 0; }
}
