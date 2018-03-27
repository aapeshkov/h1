package test;

public class FlowControl { // тело класса 
public static void main(String[] args) {// тело метода
	
	int i = 10;
	
	{
		System.out.println(i);
		
		int x = 20;
		 // х существует только в рамках этого блока	
		
	}
	// Здесь System.out.println(x); не сработает, здесь х не существует
	
	if (i <= 10) {
		System.out.println("More");
	}
	
	if (i > 10) {
		System.out.println("Less");
	} else {
		System.out.println(i > 10 ? "Less" : "More");
	} 
	
	if (i % 2 == 0) { //делится на 2 без остатка
		System.out.println("Even");
		i--;
		}
	System.out.println(i);
	
	if (i % 2 == 1){
		System.out.println("Odd");
		i++;
	}
	
	if (i == 10) {
		System.out.println(i);
	}
	
	}
}
