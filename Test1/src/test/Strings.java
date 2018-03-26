package test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Strings {
public static void main(String[] args) {
	String s ="";
	String t = "Hello";
	
	System.out.println(t.substring(2, 5));

	String r = t + "123";
	
	System.out.println(r + "987");

	int sum = 100;
	
	System.out.println("Sum = " + sum);
	
	// immutable - неизменяемый объект, строки - пример такого объекта
	
	String x = "Hello";
	System.out.println(x == t);
	System.out.println(x.equals(t)); // сравнение равенства
	
	StringBuilder sb = new StringBuilder();
	
	sb.append("Hello").append("123").append(456);// объединяет не создавая дополнительные строковые объекты
	
	System.out.println(sb.toString()); 
}
}
