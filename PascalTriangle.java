package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows == 1) {
			ArrayList<Integer> innerList = new ArrayList<>();
			innerList.add(1);
			result.add(innerList);
		}
		else if(numRows == 2) {
			ArrayList<Integer> innerList = new ArrayList<>();
			innerList.add(1);
			innerList.add(1);
			result.add(innerList);
			
		}
		else {
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
