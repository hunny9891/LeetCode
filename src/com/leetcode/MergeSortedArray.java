package com.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
/*	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] aux = new int[m + n];
		int lo = 0;
		int hi = m + n;
		int secondP = 0;
		int firstP = 0;
		for (int i = lo; i < hi; i++) {
			if(firstP >= m)
				aux[i] = nums2[secondP++];
			else if(secondP >= n)
				aux[i] = nums1[firstP++];
			else if(less(nums1[firstP], nums2[secondP]))
				aux[i] = nums1[firstP++];
			else
				aux[i] = nums2[secondP++];
		}
		

	}
	
	
	
	private boolean less(int i, int j) {
		if (i <= j)
			return true;
		return false;
	}*/
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
		int j = n - 1;
		int k = m + n -1;
		while(i >=0 && j >= 0) {
			if(nums1[i] > nums2[j])
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
		while(j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
	
	/*public void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;
		for(int i= m ;i<nums1.length;i++) {
			nums1[i] = nums2[j++];
		}
		Arrays.sort(nums1);
	}*/

	public static void main(String[] args) {
		MergeSortedArray ms = new MergeSortedArray();
		int[] x = { 5,6, 0,0,0,0};
		int[] y = {1,2,3,4 };
		ms.merge(x, 2, y, y.length);
		System.out.println(Arrays.toString(x));

	}

}
