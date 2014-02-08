package util;

public class Stack {
	int top=0;
	int [] S;
	int n;
	
	public Stack() {
//		Stack(10);
//	}

//	Stack(int n) {
		int i=10;
		this.S = new int[i];
		this.n=i;
	}
	
	
	public boolean isEmpty(){
		if( this.top <= 0)
			return true;
		return false;
	}
	public void push(int data){
		if(this.top>=this.n){
			System.out.println("overflow");
		}
		this.top++;
		this.S[top]=data;
	}
	public int pop(){
		if(this.top<=0){
			System.out.println("underflow");
			return -1;
		}
		this.top--;
		return this.S[this.top+1];
	}
	

}
