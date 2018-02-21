package com.fivejoy.normal;



public class Detector {
	//随机生成一个元素 数量小于N的数组，数组元素值在0-M之间
	public static int[] GenerateRandomArray(int N,int M){
		//Math.random()----生成[0,1)之间的浮点数--转为Double--数组大小[0,N]
		int[] a=new int[(int) (Math.random()*(N+1))];
		for(int i=0;i<a.length;i++){
			a[i]=(int)((Math.random()*(M+1))-(int)M*Math.random());
		}
		
		//Array.PrintArray(a);
		System.out.println(a.length);
		return a;
	}
	public static void test(String[] args){
		int test_time=500000;
		int N=100;
		int M=100;
		boolean succeed=true;
		for(int i=0;i<test_time;i++){
			//在检测内部，分别使用流程X和easy流程实现，并对结果进行比较-一旦结果不一致则立刻输出【问题输入】并跳出循环
//			int[] randomArray=GenerateRandomArray(N, M);
//			int[] a1=CopyArray(randomArray);
//			int[] a1=CopyArray(randomArray);
//			int result1=X(a1);
//			int result2=easy(a2);
//			if(!isEqual(a1,a2)){
//				succeed=false;
//				Print(randomArray);
//				break;
//			}
		}
	}
	
	public static void main(String[] args){
		GenerateRandomArray(5, 10);
	}

}
