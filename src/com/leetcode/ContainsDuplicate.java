package com.leetcode;

import java.util.Arrays;

public class ContainsDuplicate {
	public boolean containsDuplicate(int nums[]) {
		if(nums == null) throw new IllegalArgumentException();
		Arrays.sort(nums);
		
		for(int i=1;i<nums.length;i++)
			if(nums[i -1] == nums[i]) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
