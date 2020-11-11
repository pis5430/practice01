package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double one_dolla = 1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		double one = sc.nextDouble();
		
		System.out.println("받으실 달러는 " + one/one_dolla);
		
		
		sc.close();
		
	}

}
