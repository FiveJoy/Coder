package com.fivejoy.normal;



public class Detector {
	//�������һ��Ԫ�� ����С��N�����飬����Ԫ��ֵ��0-M֮��
	public static int[] GenerateRandomArray(int N,int M){
		//Math.random()----����[0,1)֮��ĸ�����--תΪDouble--�����С[0,N]
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
			//�ڼ���ڲ����ֱ�ʹ������X��easy����ʵ�֣����Խ�����бȽ�-һ�������һ��������������������롿������ѭ��
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
