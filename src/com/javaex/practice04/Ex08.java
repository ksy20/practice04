package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] ball =  new int[6]; 
		
		for (int i=0; i<6; i++) {
			ball[i] = (int)(Math.random()*45)+1;
		}
		
		for (int i=0; i<6; i++) {
			System.out.print(ball[i]+"\t");
		}

	}

}
