package linkedList;

import util.LinkedList;
import util.Stack;

public class Prac1 {
	public static void main(String [] args){
		LinkedList head = new LinkedList();
		head.setData(1);
		head.setNext(new LinkedList(2));
		head.getNext().setNext(new LinkedList(3));
		head.getNext().getNext().setNext(new LinkedList(4));
		head.getNext().getNext().getNext().setNext(new LinkedList(5));
		head.getNext().getNext().getNext().getNext().setNext(new LinkedList(6));
		
		getList(head);
	}
	
/*
Given linked list as a-x-b-y-c-z 
output it as a-b-c-z-y-x 
that is reverse alternate element and append to end of list
*/
	public static void getList(LinkedList head){
		if(head == null)
			return;
		int i=1;
		Stack S = new Stack();
		while(head != null){
			int d = head.getData();
			if(i%2==0)
				S.push(d);
			else
				System.out.print(" "+d);
			head = head.getNext();
			i++;
		}
		while(!S.isEmpty()){
			System.out.print(" "+S.pop());
		}
	}
}
