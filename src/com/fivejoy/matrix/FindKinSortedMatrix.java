package com.fivejoy.matrix;

public class FindKinSortedMatrix {
	//---------------±¾½â·¨´íÎó£¡
	public static boolean FindKinLine(int[][] A,int r1,int c2,int K){
		int c1=0,r2=r1;
		for(int c=c1;c<=c2;c++){
			if(A[r1][c]==K)
				return true;	
		}
		 return false;
	}
	public static boolean FindK(int[][] A,int K){
		int r1=0,c2=A[0].length-1;
		for( r1=0;r1<A.length;r1++){
			if(FindKinLine(A, r1, c2, K))
				return true;
			else c2--;
		}
		return false;
	}
}
