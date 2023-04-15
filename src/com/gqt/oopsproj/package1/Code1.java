package com.gqt.oopsproj.package1;
//ENCAPSULATION

//-->Example Program where Encapsulation is not present

//class Dog{
//	String name;
//	int age;
//	int cost;
//	String color;
//	String breed;
//}
//public class Code1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog d1=new Dog();
//		d1.name="Lucky";
//		d1.age=2;
//		d1.cost=10000;
//		d1.color="Black";
//		d1.breed="Shitzu";
//	}
//
//}

//As seen in the above code we can access the properties of the dog inside the main class 
// by directly creating the object of dog.

//As per Encapsulation these properties are most important.Hence these must not be directly
// accesible outside.

//-->Example Program where Encapsulation is present(Using independent setters and getters)

//class Dog{
//	String name;
//	int age;
//	int cost;
//	String color;
//	String breed;

//Independent Setters and getters

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getCost() {
//		return cost;
//	}
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public String getBreed() {
//		return breed;
//	}
//	public void setBreed(String breed) {
//		this.breed = breed;
//	}
//	
//	
//}
//public class Code1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog d1=new Dog();
//		d1.setName("Lucky");
//		d1.setAge(2);
//		d1.setCost(10000);
//		d1.setColor("Black");
//		d1.setBreed("Shitzu");
//		
//		System.out.println(d1.getName());
//		System.out.println(d1.getAge());
//		System.out.println(d1.getCost());
//		System.out.println(d1.getColor());
//		System.out.println(d1.getBreed());
//	}
//
//}

// Common/General setters and getters

class Dog{
	String name;
	int age;
	int cost;
	String color;
	String breed;
	
	//General Setters and Getters
	void setData(String a, int b, int c, String d, String e)
	{
		name=a;
		age=b;
		cost=c;
		color=d;
		breed=e;
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(color);
		System.out.println(breed);		
	}
	
	
}
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.setData("Lucky", 5000, 3, "Black", "Shitzu");
		d1.getData();
		
		
	}

}