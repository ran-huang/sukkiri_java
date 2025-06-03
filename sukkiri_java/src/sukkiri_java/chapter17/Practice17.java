package sukkiri_java.chapter17;

import java.io.IOException;

public class Practice17 {
	public static void main(String[] args) {
		// practice17_1();
		practice17_4();
	}
	
	public static void practice17_1() {
		String s = null;
		System.out.println(s.length());
	}
	
	public static void practice17_2() {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException is caught.");
			System.out.println("--stacktrace begins--");
			e.printStackTrace();
			System.out.println("--stacktrace ends--");
		}
		
	}
	
	public static void practice17_3() {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void practice17_4() {
		throw new IOException();
	}
}
