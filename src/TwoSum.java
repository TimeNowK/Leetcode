import java.util.*;
public class TwoSum {
    /*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    */
    public int[] twoSum(int[] nums, int target){
        if (nums == null || nums.length < 2) {
            return new int[]{0,0};
        }
        int tmp[] = new int[]{0,0};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                tmp[0] = map.get(target - nums[i]);
                tmp[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return tmp;
    }

}

