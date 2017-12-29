package com.leetcode.strings;

public class StringtoInteger {
	public int myAtoi(String str) {
		int res = 0;
		if(str == null || str.isEmpty()) return 0;
		if(str.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+')) return 0;
		if(isValidChar(str.charAt(0))) {
			if(str.charAt(0) == '-') {
				res = -1 * computeNumber(str.substring(1));
			}
			else if(str.charAt(0) == '+'){
				res = computeNumber(str.substring(1));
			}
			else {
				res = computeNumber(str);
			}
		}
		return res;
	}

	private boolean isValidChar(char ch) {
		if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7'
				|| ch == '8' || ch == '9' || ch == '-' || ch == '+')
			return true;
		return false;
	}
	
	private int computeNumber(String str) {
		int temp = -1;
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(0) != '-') {
				temp = (int) str.charAt(i) - (int) '0';
				result = result * 10 + temp;
			}
		}
		return result;
	
	}

	public static void main(String[] args) {
		StringtoInteger s = new StringtoInteger();
		System.out.println(s.myAtoi("+3"));
	}

}
