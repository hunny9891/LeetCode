package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
	/*public int[] twoSum(int[] nums, int target) {
		int[] resultArray = new int[2];
		if (nums.length == 0) {
			resultArray[0] = 0;
			resultArray[1] = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] + nums[j] == target) {
					if(i < j) {
						resultArray[0] = i;
						resultArray[1] = j;
						break;
					}
					else {
						resultArray[0] = j;
						resultArray[1] = i;
					}
				}
			}
		}
		return resultArray;
	}*/
	
	public int[] twoSum(int[] nums, int target) {
		int [] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target - nums[i])) {
				result[0] = i;
				result[1] = map.get(target - nums[i]);
				if(result[0] != result[1])
					return result;
			}
		}
		result[0] = 0;
		result[1] = 0;
		return result;
	}

	public static void main(String[] args) {
		TwoSums sums = new TwoSums();
		int[] nums = {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(sums.twoSum(nums, target)));
	}
}
