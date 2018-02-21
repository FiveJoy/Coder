package com.fivejoy.heapsort;

public class MyHeap {
	
	public int[] Space;
	public int size;
	public int CurCount;
	
	public MyHeap(int size){
		Space=new int[size];
		this.size=size;
		CurCount=0;
	}
	// parent=i,leftc=2i+1;right=2i+2 еп╤о2i+1<=size;2i+2<size
	// leftc=i,right=i+1;parent=i/2
	
	

}
