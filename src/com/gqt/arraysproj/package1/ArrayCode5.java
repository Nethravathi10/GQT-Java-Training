package com.gqt.arraysproj.package1;
import java.util.Arrays;
//Write a program to sort the given array

public class ArrayCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,11,15,77,61,5,1};
		//Arrays is a built-in class that is available inside the util package
		Arrays.sort(arr);
		for( int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
	}
	}
}
