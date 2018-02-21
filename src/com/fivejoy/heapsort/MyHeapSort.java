package com.fivejoy.heapsort;

import java.util.Arrays;

import com.fivejoy.normal.Utils;

public class MyHeapSort {

	//从小到大顺序排序
	public static void HeapSort(int[] arr){
		if (arr == null || arr.length < 2) {
			return;
		}
		
		for(int i=0;i<arr.length;i++){
			HeapInsert(arr, i);
		}
		//上步实现了最大堆-但数组不是有序的
		
		//将堆中最大值下移并调整堆--相当于删除操作
		int size=arr.length;
		Utils.swap(arr,0,--size);
		while(size>0){
			Heapify(arr,0,size);
			Utils.swap(arr,0,--size);
		}
	}
	//将某数向下调整-使当前数组满足最大堆
	private static void Heapify(int[] a, int index, int size) {
		//先查看哪个孩子比当前值大-然后swap
		int left_index=index*2+1;
		while(left_index<size){
			int biggest;
//			if(left_index+1<size&&a[left_index+1]>a[left_index])
//				biggest=left_index+1;
//			else biggest=left_index;
			biggest=left_index<size&&a[left_index+1]>a[left_index]?left_index+1:left_index;
			biggest=a[index]>a[biggest]?index:biggest;
			if(biggest==index)
				break;
			Utils.swap(a, biggest, index);
			index=left_index;
			left_index=2*index+1;
		}
		
	}
	// parent=i,leftc=2i+1;right=2i+2 判断2i+1<=size;2i+2<size
	// leftc=i,right=i+1;parent=i/2
	public static void HeapInsert(int[] arr,int index){
		for(int parent=index/2;parent>=0&&index>=0&&arr[parent]<arr[index];index=parent,parent=index/2)
			Utils.swap(arr,index,parent);
	}
	
	public static void main(String[] args){
		testByTimes();
	}
	private static void testByTimes() {
		int times=500;
		int size=10;
		int value=100;
		boolean succeed=true;
		int[] arr;
		for(int i=0;i<times;i++){
			arr=Utils.GenerateRandomArray(size, value);
			System.out.print("测试数组：");
			Utils.PrintArray(arr);
			int[] arr1=Utils.CopyArray(arr);
			int[] arr2=Utils.CopyArray(arr);
			Comparator(arr1);
			HeapSort(arr2);
			if(!Utils.isEqual(arr1, arr2))
			{
				System.out.print("Correct Answer="+arr1);
				System.out.print("Wrong Answer=");
				Utils.PrintArray(arr2);
				break;
			}
		}
		if(succeed)
			System.out.println("Congratulations!!!");
		
	}
	// for test
		public static void Comparator(int[] arr) {
			Arrays.sort(arr);
		}

}
