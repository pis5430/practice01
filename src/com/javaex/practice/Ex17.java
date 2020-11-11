package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("반지름: ");
		
		int r = sc.nextInt();
		
		double pi = 3.14;
		
		double v = (4/3)*pi*Math.cbrt(r); //??
				
		
		System.out.println("구의부피는: " +  v  + "입니다.");
		
		
		sc.close();
		

	}

}
