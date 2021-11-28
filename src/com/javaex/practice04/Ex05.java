package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[5];
		
		double sum = 0;
		
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum = sum+num[i];
		}
		
		System.out.println("평균은 "+sum/5+" 입니다.");
		//System.out.println(sum);
		
		
		sc.close();
		

	}

}
