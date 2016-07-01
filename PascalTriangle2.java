package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> innerList = null;
		for(int i=0;i<=rowIndex;i++) {
			if(i == 0) {
				innerList = new ArrayList<Integer>();
				innerList.add(1);
				result.add(innerList);
			}
			else if(i == 1) {
				innerList = new ArrayList<Integer>();
				innerList.add(1);
				innerList.add(1);
				result.add(innerList);
			}
			else {
				innerList = new ArrayList<Integer>();
				innerList.add(1);
				List<Integer> previousList = result.get(i-1);
				for(int j=1;j<previousList.size();j++) {
					innerList.add(previousList.get(j - 1) + previousList.get(j));
				}
				innerList.add(1);
				result.add(innerList);
			}
		}
        return result.get(rowIndex);
    }
	public static void main(String[] args) {
		PascalTriangle2 t = new PascalTriangle2();
		System.out.println(t.getRow(9).toString());
	}

}
