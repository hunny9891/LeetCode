package com.leetcode;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		if(nums == null) return 0;
		int j = 0, len = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i -1] != nums[i]) {
				nums[++j] = nums[i]; 
				len++;
			}
			
		}
		return len + 1;
    }
	
	public static void main(String[] args) {
		RemoveDuplicates d = new RemoveDuplicates();
		int[] x =  {1,1,3,3,3,3,3,4,4,4,4,5,5,6,6,7,7,8,9,10,10,10};
		System.out.println(d.removeDuplicates(x));
	}
}
