package com.leetcode.strings;

import java.util.Scanner;

public class ReverseString {
	public String reverseString(String s) {
		char[] arr = s.toCharArray();
		int i=0;
		int j=arr.length - 1;
		while(i < j) {
			swap(arr, i, j);
			j--;
			i++;
		}
		String result = new String(arr);
		return result;
	}
	

	private void swap(char[] stringArr, int present, int i) {
		char temp = stringArr[present];
		stringArr[present] = stringArr[i];
		stringArr[i] = temp;
	}

	public static void main(String[] args) {
		ReverseString rv = new ReverseString();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please input a word!");
			System.out.println("----------------------");
			String testString = scanner.nextLine();
			System.out.println(rv.reverseString(testString));
			System.out.println("----------------------");
		}
		
	}

}
