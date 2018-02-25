package com.fivejoy.byarray;

//index表示下一个新加入的元素应放入的位置
//index=size时不能新加入了
//index=0时不能再弹出了。
//pop->size--
//peek->return 
//push->size++
public class StackByArray {
	private int[] arr;
	private int size;
	//private int index;
	public StackByArray(int initSize){
		if(initSize<0)
			throw new IllegalArgumentException();
		//对输入参数进行处理
		arr=new int[initSize];
		size=0;
		//index=0;
	}
	public int Pop(){
		if(size==0)
			throw new ArrayIndexOutOfBoundsException("this stack is empty.");
		return arr[size--];
		
	}
	public int Peek(){
		if(size==0)
			throw new ArrayIndexOutOfBoundsException("this stack is empty.");
		return arr[size-1];
		
	}
	public void Push(int data){
		if(size==arr.length)
			throw new ArrayIndexOutOfBoundsException("this stack is full.");
		arr[size++]=data;
	}

}
