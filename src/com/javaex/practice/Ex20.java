package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("500원 개수: ");
		int a = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int b = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int c = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int d = sc.nextInt();
		
		
		int a500 = a*500;
		int b100 = b*100;
		int c50 = c*50;
		int d10 = d*10;
		
		int all = a500+b100+c50+d10;
		
		
		System.out.println("동전의 총합은 " + all + " 원 입니다.");
		
		
		
		sc.close();

	}

}
