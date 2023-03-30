package GqtCodes;

import java.util.Scanner;

public class Love {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		//Alphabet I
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==0 || j==(n/2) || i==(n-1))
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			//Logic Heart
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=0 && i<=5 && i!=1) || 
						(j==1 && i<=6 && i!=0) ||
						(j==2 && i<=7)||
						(j==3 && i<=8) ||
						(j==4 && i<=9 && i!=0) ||
						(j==5 && i<=10 && i!=0 && i!=1) ||
						(j==6 && i<=9 && i!=0) ||
						(j==7 && i<=8)||
						(j==8 && i<=7) ||
						(j==9 && i<=6 && i!=0) ||
						(j==10 && i<=5 && i!=0 && i!=1) )
				{
					System.out.print("# ");
				}
			else
				{
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			
			//Logic for U
				for(int j=0;j<=n-1;j++) {
					if((j==(n/4) && i!=(n-1))|| (j==(3*n/4) && i!=(n-1))
							|| (i==(n-1) && j>(n/4) && j<(3*n/4))) 
					{
						System.out.print("# ");
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



