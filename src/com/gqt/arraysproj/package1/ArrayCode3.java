/*
 * 		(i)		(j)		(k)
 * 		sch		cls		stu
 * 		  0		 0		5
 * 		         1      5
 * 		  1		 0		5
 * 		         1      5
 * 		  2		 0		5
 * 				 1		5
 * 
 */




package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class ArrayCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of school: ");
		int sch=sc.nextInt();
		
		System.out.println("Enter the count of class: ");
		int cls=sc.nextInt();
		
		System.out.println("Enter the count of student: ");
		int stu=sc.nextInt();

		int arr[][][]=new int[sch][cls][stu];
		
		//Storing an array
		for(int i=0;i<sch;i++) {
			System.out.println("Inside school :"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside class :"+(j+1));
				for(int k=0;k<sch;k++) {
					System.out.println("Enter marks of student no :"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
						//Fetching the marks
					for(int i=0;i<sch;i++) {
						System.out.println("Inside school :"+(i+1));
						for(int j=0;j<cls;j++) {
							System.out.println("Inside class :"+(j+1));
							for(int k=0;k<sch;k++) {
								System.out.println("The marks of student no :"+(k+1)+ " is : " +arr[i][j][k]);
							}
						}
					}
	}
}