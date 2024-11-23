package src.problems.contains_duplicate_217;

import java.util.*;

public class ContainsDuplicate {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    for (String string : args) {
      nums.add(Integer.parseInt(string));
    }

    Set<Integer> numSet = new HashSet<>();
    for (Integer num : nums) {
      if (numSet.contains(num)) {
        System.out.println("true");
        System.exit(0);
      }
      numSet.add(num);
    }
    System.out.println("false");
  }
}
