package com.leetcode;

import java.util.HashSet;


public class ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) return true;
			set.add(nums[i]);
			if(i >= k) set.remove(nums[i-k]);
		}
		return false;
	}

	
	public static void main(String[] args) {
		ContainsDuplicate2 c = new ContainsDuplicate2();
		int[] x = {1,0,1,1};
		System.out.println(c.containsNearbyDuplicate(x, 1));
	}

}
