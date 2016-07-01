package com.leetcode;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		if(nums == null) throw new IllegalArgumentException();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 0);
			map.put(nums[i], map.get(nums[i]) + 1);
		}

		int maxKey = -1;
		int maxVal = -1;
		for (int key : map.keySet()) {
			if (maxVal < map.get(key)) {
				maxVal = map.get(key);
				maxKey = key;
			}
		}

		return maxKey;
	}

	public static void main(String[] args) {
		MajorityElement e = new MajorityElement();
		int[] x = { 4, 8, 3, 1, 8 };
		System.out.println(e.majorityElement(x));
	}
}
