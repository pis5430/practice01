package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		final double pi = 3.14;
		
		System.out.print("반지름: ");
		
		int r = sc.nextInt();
	
		double v = (4*pi*r*r*r)/3;
				
		
		System.out.println("구의부피는: " + v + "입니다.");
		
		//반지름을 12로 햇을때 7234.56이 나옴 반올림 여부는 어떻게 결정가능한지?
		
		//문제에서는 반지름 : 12 -- > 구의부피 7234.5599999999995
		
		
		sc.close();
		

	}

}
