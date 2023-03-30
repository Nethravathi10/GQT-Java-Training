package GqtCodes;

import java.util.Scanner;

public class UniversalPat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)//first and last row
						|| j==0 || j==(n-1)//first and last column
						|| i==(n/2)//middle row and column
						|| i==j//first big diagonal
						|| i+j==(n-1)//second big diagonal
						|| i+j==(n/2)//first small diagonal
						|| j-i==(n/2)//second small diagonal
						|| i-j==(n/2)//third small diagonal
						|| i+j==(n-1)+n/2//fourth small diagonal
			)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
