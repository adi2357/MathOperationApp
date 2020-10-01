package com.bridgelabz.mathoperationapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;



public class NumberPlayList implements Consumer<Integer> {
	
	public void accept(Integer t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numberList=new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		
		System.out.println("Iterating using forEach : ");
		numberList.forEach(n->System.out.println(n));
		
		System.out.println("\nIterating using proper Class : ");
		NumberPlayList myConsumer=new NumberPlayList();
		numberList.forEach(myConsumer);
		
		System.out.println("\nIterating using Anonymous Consumer Interface : ");
		numberList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		System.out.println("\nIterating using Lambda Expression : ");
		Consumer<Integer> consume=n -> {
			System.out.println(n);
		};
		numberList.forEach(consume);
	}
}