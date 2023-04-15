package com.gqt.staticproj.package1;
class Test{
	static int a,b,c;//static variables
	int m,n,o;//non-static variables
	
	//static block
	static {
		a=10; b=20; c=30;
		//m=100; n=200; o=300;//cannot access non-static reference
	}
	 
	//non-static block
	{
		m=11; n=21; o=31;
		a=101; b=201; c=301;//we can static variable in non-static block
	}
	
	//static method
	static void display() {
		System.out.println(a+"---"+b+"---"+c);
		//System.out.println(m+"---"+n+"---"+o);//cannot access non-static reference
	}
	
	//non-static method
	void display2() {
			System.out.println(m+"---"+n+"---"+0);
			System.out.println(a+"---"+b+"---"+c);//can access the static reference
		}
}
public class StaticLaunch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before object creation and before value assigmnet="+Test.a+"--"+Test.b+"--"+Test.c);
		Test.a=1001;
		Test.b=2001;
		Test.c=3001;
		Test.display();
		System.out.println("Before object creation and after value assigmnet="+Test.a+"--"+Test.b+"--"+Test.c);
		Test t1=new Test();
		System.out.println("After value assigmnet in non static block="+Test.a+"--"+Test.b+"--"+Test.c);
		t1.m=12;
		t1.n=22;
		t1.o=33;
		t1.display2();
		
	}

}
