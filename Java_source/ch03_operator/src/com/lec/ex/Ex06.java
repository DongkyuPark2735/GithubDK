package com.lec.ex;

public class Ex06 {
	public static void main(String[] args) {
		int h = 100;
		String result;
		result = (h % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(result);
		if (h % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}

		System.out.println(result);
	}

}
