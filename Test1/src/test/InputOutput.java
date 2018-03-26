package test;

import java.util.Scanner; // Для того чтобы каждый раз не прописывать полное название пакета
public class InputOutput {
	public static void main(String[] args) {
		System.err.print(1);
		System.err.println(2);
		System.out.println(3);
		//wrapper - обертка
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("Hello, " + name);
	}

}
