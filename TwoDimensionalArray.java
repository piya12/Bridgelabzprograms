package com.bridgelabz.programs;
/*
* created by: Bridge Labz
* Date 15/07/2016
* Perpose: 2D arrays of integers and doubles from standard input and printing them out to standard output.
**/
import com.bridgelabz.util.Utility;
public class TwoDimensionalArray
{
		Utility u2=new Utility();
		//Reads a 2D array of doubles from keyboard and returns it.
		public double[][] readDoubleArray(int M,int N)
			{
				double[][] array=new double[M][N];
				for (int i=0;i<M;i++)
					{
						for (int j=0;j<N;j++)
							{
								array[i][j]=u2.getDoubleInput();
							}
					}
				return array;
			}
		//Prints the 2D array of doubles on console as output.
		public static void Disp(double[][] array) //method 1
			{
				int M = array.length;
				int N = array[0].length;
				for (int i=0; i<M;i++)
					{
					 for (int j=0;j<N;j++)
						 {
							System.out.print(" "+array[i][j]);
						 }
					System.out.println();
					}
			}
		// Reads a 2D array of integers from keyboard as input and returns it.
		public int[][] readIntArray(int M,int N)
			{
				System.out.print("Number of rows (M) :");
				M=u2.getIntegerInput();
				System.out.print("Number of columns (N) :");
				N=u2.getIntegerInput();
				int[][] array = new int[M][N];
				for (int i=0;i<M;i++)
					{
						for (int j=0;j<N;j++)
							 {
								array[i][j]=u2.getIntegerInput();
							 }
					}
				return array;
			}
			//Print a 2D array of integers on console as output.
			public static void Display(int[][] array) //method 2
				{
					 int M = array.length;//it will taken rows length
					 int N = array[0].length;//it will taken columns length
					for (int i=0; i<M; i++)
						{
							for (int j=0;j<N;j++)
								{
									System.out.print(" "+array[i][j]);
								}
									System.out.println();
						}
				}
	public static void main(String[] args)
	{
			Utility u1=new Utility();
			//ask the user no.of rows do you want
			System.out.print("Number of rows (M) :");
			int M=u1.getIntegerInput();
			//ask the user no.of columns do you want
			System.out.print("Number of columns (N) :");
			int N=u1.getIntegerInput();
			TwoDimensionalArray d1=new TwoDimensionalArray();
			// read and print an matrix of doubles
	    double[][] a=d1.readDoubleArray(M,N);
			System.out.println("================================");
			System.out.println("=====2D Double Array==========");
			System.out.println("================================");
			TwoDimensionalArray.Disp(a);//static method calls method 1
			System.out.println();
	        // read and print a matrix of integers
			TwoDimensionalArray d2=new TwoDimensionalArray();
	    int[][] b=d2.readIntArray(M,N);
			System.out.println("================================");
			System.out.println("=====2D Integers Array==========");
			System.out.println("================================");
	        TwoDimensionalArray.Display(b);//static method calls method 2
	        System.out.println();

	}
}
