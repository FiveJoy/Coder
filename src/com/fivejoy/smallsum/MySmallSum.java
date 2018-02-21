package com.fivejoy.smallsum;


import com.fivejoy.normal.Utils;

public class MySmallSum {
	public static int Problem_1(int[] a){
		if(a==null||a.length<=1)
			return 0;
		else return SmallSum(a, 0, a.length-1);
	}
	public static int SmallSum(int[] a,int left,int right){
		if(right==left) 
			return 0;
		///int mid=(left+(right-left)>>1);
		int mid=(left+right)/2;
		int leftSmallSum=SmallSum(a,left,mid);
		int rightSmallSum=SmallSum(a, mid+1, right);
		return leftSmallSum+rightSmallSum+Merge(a, left, mid, right);
	}
	public static int Merge(int[] a,int left,int mid,int right){
		int ls=left,le=mid,rs=mid+1,re=right;
		int result=0;
		int[] tempa=new int[right-left+1];
		int t=0;
		while(ls<=le&&rs<=re){
			result+=a[ls]<a[rs]?a[ls]*(re-rs+1):0;
			tempa[t++]=a[ls]<a[rs]?a[ls++]:a[rs++];		
		}
		while(ls<=le){
			tempa[t++]=a[ls++];
		}
		while(rs<=re){
			tempa[t++]=a[rs++];
		}
		for(t=0,ls=left;t<tempa.length;t++,ls++){
			a[ls]=tempa[t];
		}
		return result;
	}
	
	
	
	//for test
	//��ÿ��������  ��������С�����ĺ�
	public static int Comparetor(int[] a){
		if(a==null||a.length<=1)
			return 0;
		int smallsum=0;
		for(int i=1;i<a.length;i++){//�ӵ�һ������������һ��������ÿ�������б���ɨ��
			for(int j=i-1;j>=0;j--){
				smallsum+=a[j]<a[i]?a[j]:0;
			}
		}
		return smallsum;
	}

	public static void main(String[] args){
		int times=5000;
		boolean succeed=true;
		int size=100;
		int value=100;
		int[] a;
		for(int i=0;i<times;i++){
			a=Utils.GenerateRandomArray(size, value);
			int[] a1=Utils.CopyArray(a);
			int[] a2=Utils.CopyArray(a);
			int r1=Comparetor(a1);
			int r2=Problem_1(a2);
			if(r1!=r2){
				System.out.println("Correct Answer="+r1);
				System.out.print("Wrong Answer="+r2 +"with:");
				Utils.PrintArray(a);
				break;
			}
		}
		if(succeed)
			System.out.println("Congratulations!!!");
	}
	
	

}
