package com.leetcode.strings;

import java.util.Scanner;

public class ReverseVowels {
	
	public String reverseVowels(String s) {
		char[] arr = s.toCharArray();
		int i=0;
		int j=arr.length - 1;
		while(true) {
			if(i > j) break;
			if(isVowel(arr[i])) {
				while(!isVowel(arr[j])) {
					j--;
				}
				swap(arr, i, j);
				j--;
			}
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

	private boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
				|| ch == 'U')
			return true;
		return false;
	}

	public static void main(String[] args) {
		ReverseVowels rv = new ReverseVowels();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please input a word!");
			System.out.println("----------------------");
			String testString = scanner.nextLine();
			System.out.println(rv.reverseVowels(testString));
			System.out.println("----------------------");
		}
		
	}

}
