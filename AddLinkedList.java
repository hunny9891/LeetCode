package com.leetcode;



public class AddLinkedList {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode resultHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = resultHead;
		int carry = 0;
		while(p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum/10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if(p != null) p = p.next;
			if(q != null) q = q.next;
		}
		
		if(carry > 0) {
			curr.next = new ListNode(carry);
		}
        return resultHead.next;
    }
	
	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	/*public MyLinkedList<Integer> addTwoNumbers(MyLinkedList<Integer> l1, MyLinkedList<Integer> l2) {
		MyLinkedList<Integer> resultList = new MyLinkedList<Integer>();
		MyLinkedList<Integer> tempList = new MyLinkedList<Integer>();
		if(l1.size() >= l2.size()) {
			Iterator<Integer> itr = l1.iterator();
			Iterator<Integer> itr2 = l2.iterator();
			int carry = 0;
			while(itr.hasNext()) {
				int sum = 0;
				if(itr2.next() == null) sum = itr.next() + 0;
				else 
					sum = itr.next() + itr2.next() ;
				if(sum >= 10) {
					tempList.addItem(sum % 10);
					carry = sum/10;
				}
				else {
					tempList.addItem(sum % 10 + carry);
					carry = 0;
				}
			}
		}
		for(int num : tempList)
			resultList.addItem(num);
        return resultList;
    }*/
	
	
}