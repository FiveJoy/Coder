package com.fivejoy.byarray;

//最初 first、last指向的都是小的，当push的时候last增长而first不变-一直指向的是index=0，只有FIFO时候，first需要后移，first+1：
//last 表示新加的数填到哪去.逻辑是填到最后要回到开头---只要size还有
//first 指向的数是pop()出去的数--只要size>0
//一切使用size联系，而将end&start解耦

//输入的数值判断
public class QueueByArray {
	///Google一面
	private int first;
	private int last;
	private int size;
	private int[] arr;
	public QueueByArray(int initSize){
		if(initSize<0)
			throw new IllegalArgumentException("initsize is wrong.");
		arr=new int[initSize];
		first=0;
		last=0;
		size=0;
	}
	public int Peek(){
		if(size>0)
			return arr[first];
		else throw new ArrayIndexOutOfBoundsException("this queue is empty.");
	}
	public int Poll(){
		if(size<=0)
			throw new ArrayIndexOutOfBoundsException("this queue is empty.");
		int result=arr[first];
		size--;
		first=(first==arr.length)?0:first+1;
		return result;
	}
	public void Push(int data){
		if(size==arr.length)
			throw new ArrayIndexOutOfBoundsException("the queue is full");
		size++;
		arr[last]=data;
		last=(last==arr.length-1)?0:last+1;
	}

}
