package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};

		System.out.println(c); // 변경전
		
		for(int i=0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
		}
		
		System.out.println(c); // 변경후
	}

}
