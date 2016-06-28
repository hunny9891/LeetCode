package com.leetcode;

import java.util.Arrays;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int N = nums.length;
		if(N == 1 || k == N) return;
		else if(k < N) {
			reverseArr(nums, 0, N - k - 1);
			reverseArr(nums, N - k, N - 1);
			reverseArr(nums, 0, N - 1);
		}
		else {
			k = k % N;
			reverseArr(nums, 0, N - k - 1);
			reverseArr(nums, N - k, N - 1);
			reverseArr(nums, 0, N - 1);
		}
	}
	private void reverseArr(int[] nums, int start, int end) {
		while(start < end) {
			exch(nums,start,end);
			start++;
			end--;
		}
		
	}
	private void exch(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
	/*public void rotate(int[] nums, int k) {
		int N = nums.length;
		if(N == 1) return;
		if (k == nums.length)
			return;
		else if (k > N) {
			int iter = k % N;
			int[] arr = new int[iter];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = nums[nums.length - iter + i];
			}
			for (int j = nums.length - 1 - iter; j >= 0; j--) {
				nums[j + iter] = nums[j];
			}

			for (int m = 0; m < iter; m++) {
				nums[m] = arr[m];
			}
		
		} else {
			int[] arr = new int[k];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = nums[nums.length - k + i];
			}
			for (int j = nums.length - 1 - k; j >= 0; j--) {
				nums[j + k] = nums[j];
			}

			for (int m = 0; m < k; m++) {
				nums[m] = arr[m];
			}
		}
	}*/

	/*
	 * private void exch(int[] nums, int i, int j) { System.out.println(i + " "
	 * + j);
	 * 
	 * int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp; }
	 */
	public static void main(String[] args) {
		RotateArray arr = new RotateArray();
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };
		arr.rotate(x, 20);
		System.out.println(Arrays.toString(x));
	}

}
