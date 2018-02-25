package com.fivejoy.matrix;

public class PrintMatrixByZHI {
	public static void PrintMatrix(int[][] A){
		int rows=A.length-1;
		int colums=A[0].length-1;
		int r1=0,r2=0,c1=0,c2=0;
		while(r1<=rows&&r2<=rows&&c1<=colums&&c2<=colums){
			PrintIncline(A, r1, c1, r2, c2);
			//MoveR1C1(r1, c1,rows,colums);
			if(c1<colums)
				c1++;
			else r1++;
			//MoveR2C2(r2, c2,rows,colums);
			if(r2<rows)
				r2++;
			else c2++;
		}
		
		
	}
	public static void MoveR1C1(int r1,int c1,int rows,int colums){
		if(c1<colums)
			c1++;
		else r1++;
	}
	public static void MoveR1C1(int r2,int c2,int rows,int colums){
		if(r2<rows)
			r2++;
		else c2++;
	}
	public static void PrintIncline(int[][] A,int r1,int c1,int r2,int c2){
		int curR=r1,curC=c1;
		if(r1==r2&&c1==c2)
			{
				System.out.print(A[r1][c1]+" ");
				return;
			}
		if(r1==r2)
			{
				for(curC=c1;curC<=c2;curC++)
					System.out.print(A[r1][curC]+" ");
				return;
			}
				
		if(c1==c2){
			for(curR=r1;curR<=r2;curR++)
				System.out.print(A[curR][c1]+" ");
			return;
		}
			
		while(curR<=r2&&curC>=c2){
			System.out.print(A[curR][curC]+" ");
			curR++;
			curC--;
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		PrintMatrix(matrix);

	}

}
