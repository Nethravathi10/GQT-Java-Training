package com.gqt.methodsproj.package1;

//METHOD WITH NO INPUT AND NO OUTPUT

//Syntax-->output(method_name)input
//			{
//				body of the method
//			}

class Calc{
	//return type	:	void (no return value)
	//parameters	:	no parameters
	void add()
	{
		int a = 10;
		int b = 20;
		int c=a+b;
		System.out.println(c);
	}
}
public class MethodType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c1=new Calc();
		c1.add();

	}

}
