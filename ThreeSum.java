package com.bridgelabz.programs;
import java.util.Scanner;

public class ThreeSum {
	private static Object StdIn;

	// print distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	public static void printAll(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}

	}
	// return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k]
	// = 0

	public static void main(String[] args) {
		int a1;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Entet array elements");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		ThreeSum.printAll(a);
	}
}


