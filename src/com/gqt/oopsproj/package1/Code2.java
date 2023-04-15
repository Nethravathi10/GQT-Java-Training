package com.gqt.oopsproj.package1;

//SHADOWING PROBLEM

//It is scenario where compiler is confused in differentiating b/w 
//  instance and local variables.This results in the default values
// being retained in the instance variable.
class Dog1{
	String name;
	int age;
	int cost;
	String color;
	String breed;
	
	//General Setters and Getters
	void setData(String a, int b, int c, String d, String e)
	{
		name=name; //Shadowing problem
		age=age;	//Shadowing problem
		cost=cost;  //Shadowing problem
		color=color; //Shadowing problem
		breed=breed; //Shadowing problem
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(color);
		System.out.println(breed);		
	}
	
	
}
public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1=new Dog1();
		d1.setData("Lucky", 5000, 3, "Black", "Shitzu");
		d1.getData();
		
		
	}

}


