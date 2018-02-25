package com.fivejoy.byarray;

//index��ʾ��һ���¼����Ԫ��Ӧ�����λ��
//index=sizeʱ�����¼�����
//index=0ʱ�����ٵ����ˡ�
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
		//������������д���
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
