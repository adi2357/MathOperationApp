package com.bridgelabz.mathoperationapp;

import java.util.Scanner;

@FunctionalInterface
interface MathFunction{
	int calculate(int i,int j);
	static void printResult(int a, int b, String function, MathFunction mathObject ) {
		System.out.println(function+" is : "+mathObject.calculate(a, b));
	}
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
		
		MathFunction.printResult(a,b,"Addition is : ",add);
		MathFunction.printResult(a,b,"Substration is : ",subtract);
		MathFunction.printResult(a,b,"Multiplication is : ",multiply);
		MathFunction.printResult(a,b,"Division is : ",divide);
	}
}
