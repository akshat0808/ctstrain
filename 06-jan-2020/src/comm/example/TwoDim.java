package comm.example;

import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter array size");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		System.out.println("enter array:");
		int twoD[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				twoD[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("entered data:");
		
		
		
		for(int [] x: twoD)
		{
		for(int y:x)	
		
		{
			System.out.println(y+"");
			
		}
		System.out.println();
}
	}
}