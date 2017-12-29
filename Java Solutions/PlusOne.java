package com.leetcode;

import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		if (digits.length == 0) {
			int[] result = {1};
			return result;
		}
		int carry = 0;
		int sum = 0;
		int[] result = new int[digits.length + 1];
		sum = carry + 1 + digits[digits.length - 1];
		result[result.length - 1] = sum % 10;
		carry = sum / 10;
		for (int i = digits.length - 2; i >= 0; i--) {
			sum = carry + digits[i];
			carry = sum / 10;
			result[i + 1] = sum % 10;
		}
		result[0] = carry;

		if (result[0] == 0)
			return Arrays.copyOfRange(result, 1, result.length);
		return result;
	}

	public static void main(String[] args) {
		PlusOne o = new PlusOne();
		int[] a = {};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(o.plusOne(a)));
	}
}
