package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> resultList = new ArrayList<Integer>();
		if (matrix.length == 0 || matrix == null)
			return new ArrayList<Integer>();
		int top = 0;
		int bottom = matrix.length;
		int left = 0;
		int right = matrix[0].length;

		while (true) {
			for (int i = left; i < right; i++)
				resultList.add(matrix[top][i]);
			top++;
			
			if (top > bottom - 1 || left > right - 1)
				break;
			
			for (int j = top; j < bottom; j++)
				resultList.add(matrix[j][right - 1]);
			right--;
			
			if (top > bottom - 1 || left > right - 1)
				break;
			
			for (int i = right - 1; i >= left; i--)
				resultList.add(matrix[bottom - 1][i]);
			bottom--;
			
			if (top > bottom - 1 || left > right - 1)
				break;
			
			for (int j = bottom - 1; j >= top; j--)
				resultList.add(matrix[j][left]);
			left++;
			
			if (top > bottom - 1 || left > right - 1)
				break;
		}
		return resultList;
	}

	public static void main(String[] args) {
		SpiralMatrix sm = new SpiralMatrix();
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println(sm.spiralOrder(matrix).toString());
	}

}
