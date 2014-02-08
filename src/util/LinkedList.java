package util;

public class LinkedList {
	int data;
	LinkedList next= null;
	public LinkedList(int d) {
		this.data=d;
	}
	public LinkedList() {
		
	}
	public void setData(int data){
		this.data=data;
	}
	public int getData(){
		return this.data;
	}
	public void setNext(LinkedList l){
		this.next = l;
	}
	public LinkedList getNext(){
		return this.next;
	}
	

}
