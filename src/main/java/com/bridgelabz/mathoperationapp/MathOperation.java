package com.bridgelabz.mathoperationapp;

import java.util.Scanner;

@FunctionalInterface
interface MathFunction{
	int calculate(int i,int j);
}
public class MathOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MathFunction add=(i,j)->i+j;
		MathFunction subtract=(i,j)->i-j;
		MathFunction multiply=(i,j)->i*j;
		MathFunction divide=(i,j)->(j!=0)?(i/j):0;
		
		System.out.println("Enter two numbers for arithematic operations:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is : "+add.calculate(a, b));
		System.out.println("Substration is : "+subtract.calculate(a, b));
		System.out.println("Multiplication is : "+multiply.calculate(a, b));
		System.out.println("Division is : "+divide.calculate(a, b));
	}

}
