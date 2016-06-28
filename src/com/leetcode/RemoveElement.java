package com.leetcode;

import java.util.Arrays;


public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		if(nums == null) throw new IllegalArgumentException();
		
		int count = 0;
		if(nums.length == 0)  return 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j>0 && compare(nums[j], nums[j-1], val);j--) 
				exch(nums, j, j-1);
		}
		
		for(int k=0;k<nums.length;k++) {
			if(nums[k] != val) count++;
		}
        return count;
    }
	
	private void exch(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private boolean compare(int x, int y , int val) {
		if(y == val) return true;
		return false;
	}
	
	public static void main(String[] args) {
		RemoveElement elem = new RemoveElement();
		int[] nums = {3,2,2,3};
		System.out.println(elem.removeElement(nums, 3));
		System.out.println(Arrays.toString(nums));
		
	}

}
