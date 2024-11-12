package util;

public class ConvertInputUtil {
  public static int[] convertStingNumsToInts(String[] input) {
    int[] nums = new int[input.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(input[i]);
    }
    return nums;
  }
}
