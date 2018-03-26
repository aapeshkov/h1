package test;

import java.util.Scanner;

public class UnlimitedInput {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	while (scanner.hasNextLine()) {
		String nextLine = scanner.nextLine();
		System.out.println(nextLine);
		if (nextLine.equals("exit")) {
			break; // рекращет работы циклов
		
			}
		}
	
	System.out.println("Good Bye");
}

}