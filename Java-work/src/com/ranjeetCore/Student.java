package com.ranjeetCore;

public class Student {
 String name;
 int marks1;
 int marks2;
 int marks3;


 public  int calculateAverage() {
	 return (marks1+marks2+marks3)/3;
 }
 
 public static void main() {
	Student st1=new Student();
	st1.name="Ranjeet";
	st1.marks1=20;
	st1.marks2=17;
	st1.marks3=30;
	
	System.out.println("Average marks of "+ st1.name + " "+st1.calculateAverage());
	
	

 }
}
