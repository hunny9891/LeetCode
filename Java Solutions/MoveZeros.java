package com.leetcode;

import java.util.Arrays;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
       if(nums == null) throw new  IllegalArgumentException();
       if(nums.length == 0) return;
       
       for(int i=0;i<nums.length;i++) {
    	   for(int j=i;j > 0 && less(nums[j], nums[j - 1]);j--) {
    		   exch(nums,j,j-1);
    	   }
       }
    }
	
	private void exch(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private boolean less(int a, int b) {
		boolean result = false;
		if(b == 0) return true;
		return result;
	}
	
	public static void main(String[] args) {
		MoveZeros z = new MoveZeros();
		int[] x = {2,1};	
		z.moveZeroes(x);
		System.out.println(Arrays.toString(x));
	}
}
