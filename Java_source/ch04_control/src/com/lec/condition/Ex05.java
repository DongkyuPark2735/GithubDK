package com.lec.condition;

public class Ex05 {

	public static void main(String[] args) {
		int num = 3;
		if (num % 2 == 0) {
			System.out.println("礎熱");
		} else {
			System.out.println("�汝�");
		}

		switch (num % 2) {
		case 0:
			System.out.println("礎熱");
			break;
		default:
			System.out.println("�汝�");
			break;
		}

		System.out.println(num % 2 == 0 ? "礎熱" : "�汝�");

	}
}
