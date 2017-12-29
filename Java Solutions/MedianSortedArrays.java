package com.leetcode;

import java.util.Arrays;

public class MedianSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median1 = 0.0, median2 = 0.0;
		median1 = calcMedian(nums1);
		median2 = calcMedian(nums2);
		
		if(median1 == median2)
			return median1;
		else if(median1 >  median2) {
			
			return findMedianSortedArrays(Arrays.copyOfRange(nums1, 0, nums1.length/2), Arrays.copyOfRange(nums2, nums2.length/2, nums2.length));
		}
		else if(median2 > median1) {
			return findMedianSortedArrays(Arrays.copyOfRange(nums1,nums1.length/2, nums1.length), Arrays.copyOfRange(nums2, 0, nums2.length/2));
		}
		return Double.MAX_VALUE;
		
		
	}
	
	private double calcMedian(int[] nums1) {
		double median = 0.0;
		if(nums1.length % 2 == 1) median = nums1[nums1.length/2];
		else median = (nums1[nums1.length/2] + nums1[nums1.length/2 - 1])/2;
		return median;
	}
}
