package com.gqt.arraysproj.package1;
 
import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of student");
		int n=sc.nextInt();
		int arr[]=new int[n];//One Dimensional array
		
		//Storing the data
		for(int i=0;i<=n-1;i++) {
			System.out.println("Enter the marks of student no: "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("#####-----Marks Added-----#####");
		
		//fetching the data
		for(int i=0;i<=n-1;i++) {
			System.out.println("The marks of student no: "+(i+1)+ " is = "+arr[i]);
		}
	}

}
