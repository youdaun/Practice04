package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		boolean ny = true;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;
			
			for(int a=0; a<i; a++) { // 중복검사 
				if(num[i] == num[a]) { 
					i--; // 중복이면 앞에 배열부터 다시 랜덤값주도록 맨위의 for문을 되돌림
					break; // 앞에 배열은 중복검사를 이미했기 때문에 반복시키지 않고 한번으로 끝냄
				}	
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
		

}
