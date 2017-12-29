package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> innerList = null;
		for(int i=1;i<=numRows;i++) {
			if(i == 1) {
				innerList = new ArrayList<Integer>();
				innerList.add(1);
				result.add(innerList);
			}
			else if(i == 2) {
				innerList = new ArrayList<Integer>();
				innerList.add(1);
				innerList.add(1);
				result.add(innerList);
			}
			else {
				innerList = new ArrayList<Integer>();
				innerList.add(1);
				List<Integer> previousList = result.get(i-2);
				for(int j=1;j<previousList.size();j++) {
					innerList.add(previousList.get(j - 1) + previousList.get(j));
				}
				innerList.add(1);
				result.add(innerList);
			}
		}
        return result;
    }
	public static void main(String[] args) {
		PascalTriangle t = new PascalTriangle();
		System.out.println(t.generate(9).toString());
	}

}
