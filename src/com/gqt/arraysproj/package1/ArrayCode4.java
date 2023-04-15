/*
 * 		(i)		(j)		(k)		(l)
 * 		uni		sch		cls		stu
 * 		 0		 0		 0		5
 * 		                 1      5
 * 		 		 1		 0		5
 * 		                 1      5
 * 		 1		 0		 0		5
 * 		                 1      5	
 * 				 1		 0		5
 * 		                 1      5
 */

package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of university: ");
		int uni=sc.nextInt();
		
		System.out.println("Enter the count of school: ");
		int sch=sc.nextInt();
		
		System.out.println("Enter the count of class: ");
		int cls=sc.nextInt();
		
		System.out.println("Enter the count of student: ");
		int stu=sc.nextInt();

		int arr[][][][]=new int[uni][sch][cls][stu];//4-D array
		
		//Storing an array
		for(int i=0;i<uni;i++) {
			System.out.println("In University :"+(i+1));
			for(int j=0;j<sch;j++) {
				System.out.println("Inside school :"+(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("Inside class :"+(k+1));
				for(int l=0;l<stu;l++) {
					System.out.println("Enter marks of student no :"+(l+1));
					arr[i][j][k][l]=sc.nextInt();
				}
			}
		}
		}
		//Fetching the marks
					for(int i=0;i<uni;i++) {
						System.out.println("In university :"+(i+1));
						for(int j=0;j<sch;j++) {
							System.out.println("Inside school :"+(j+1));
							for(int k=0;k<cls;k++) {
								System.out.println("Inside class :"+(k+1));
							for(int l=0;l<stu;l++) {
								System.out.println("The marks of student no :"+(l+1)+ " is : " +arr[i][j][k][l]);
							}
						}
					}
	}	}

}
