package com.fivejoy.byarray;

//��� first��lastָ��Ķ���С�ģ���push��ʱ��last������first����-һֱָ�����index=0��ֻ��FIFOʱ��first��Ҫ���ƣ�first+1��
//last ��ʾ�¼ӵ������ȥ.�߼�������Ҫ�ص���ͷ---ֻҪsize����
//first ָ�������pop()��ȥ����--ֻҪsize>0
//һ��ʹ��size��ϵ������end&start����

//�������ֵ�ж�
public class QueueByArray {
	///Googleһ��
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
