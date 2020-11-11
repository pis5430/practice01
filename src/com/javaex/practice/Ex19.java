package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		
		
		// 거리 = 속도 * 시간
		// 1년 = 360*24*60*60
		// km = 300000 * (365*24*60*60) 
		
		long light = 300000L;
		long year = 365*24*60*60;

		long km = light*year;
		
		
		System.out.println("빛이 1년동안 가는 거리는 " + km + " 입니다.");
		
		
		
		

	}

}
