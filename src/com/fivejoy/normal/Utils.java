package com.fivejoy.normal;

public class Utils {
	//copy Arrays.copyOf(int[] arr,int newlength)
	public static int[] CopyArray(int[] arr){
		if(arr==null)
			return null;
		int[] tArray=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			tArray[i]=arr[i];
		}
		return tArray;
	}
	
	//print
	public static void PrintArray(int[] arr){
		if(arr==null)
			System.out.println("this array is null");
		else{
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	//随机生成数组
	public static int[] GenerateRandomArray(int size,int value){
		int[] a=new int[(int) (Math.random()*(size+1))];
		for(int i=0;i<a.length;i++){
			a[i]=(int) (Math.random()*(value+1)-Math.random()*value);
		}
		return a;
	}
	//比较数组是否一致-------Arrays.equals(arr1,arr2);
	public static boolean isEqual(int[] arr1,int[] arr2){
		if(arr1==null&&arr2==null)
			return true;
		if(arr1==null||arr2==null)
			return false;
		if(arr1.length!=arr2.length)
			return false;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
			
	}
	//交换数组中元素
	public static void swap(int[] arr,int i,int j){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	

}
