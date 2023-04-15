package com.gqt.methodsproj.package1;

//METHOD WITH INPUT AND NO OUTPUT
class Calc1
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}

public class MethodType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 c1=new Calc1();
		c1.add(10,20);
	}

}
