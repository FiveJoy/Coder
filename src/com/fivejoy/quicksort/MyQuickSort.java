package com.fivejoy.quicksort;

import java.util.Arrays;

import javax.rmi.CORBA.Util;

import com.fivejoy.normal.Utils;

public class MyQuickSort {

	public static void QuickSort(int[] arr,int left,int right){
		if(left>=right) return;
		int p=Partition(arr, left, right);
		QuickSort(arr, left, p-1);
		QuickSort(arr, p+1, right);
	}
	public static int Partition(int[] arr,int left,int right){
		//求主元，根据主元分区，左侧为小于主元的元素，右侧为大于主元的元素，并返回最终主元的位置
		//最起码是剩下三个元素才能找主元吧。
		if((right-left+1)<=2){
			if(arr[left]>arr[right])
				swap(arr, left, right);
			return left;
		}
		int pivot=SelectPivotByMedian(arr,left,right);
		//哨兵 i,j
		int i=left,j=right-1;
		while(i<j){
			while(arr[++i]<pivot) {}
			while(arr[--j]>pivot) {}
			if(i<j) swap(arr, i, j);
			else break;
		}
		swap(arr, i, right-1);
		return i;
	}

	private static int SelectPivotByMedian(int[] arr, int left, int right) {
		int mid=(right+left)/2;
		if(arr[left]>arr[mid])
			swap(arr, left, mid);
		if(arr[left]>arr[right])
			swap(arr, left, right);
		if(arr[mid]>arr[right])
			swap(arr, mid, right);
		swap(arr, mid, right-1);
		return arr[right-1];
	}
	public static void swap(int[] arr,int i,int j){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
	//for test
	public static void Comparator(int[] a){
		Arrays.sort(a);
	}
	
	//for tests
	public static void main(String[] args){
		testByTimes();
		//testNormal();
	}
	private static void testNormal() {
		int[] a={-13,6,-58,-41};
		QuickSort(a, 0, a.length-1);
		Utils.PrintArray(a);
		
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
			Problem(arr2);
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
	private static void Problem(int[] arr2) {
		if(arr2==null||arr2.length<=1)
			return;
		QuickSort(arr2, 0, arr2.length-1);
	}
	
}
