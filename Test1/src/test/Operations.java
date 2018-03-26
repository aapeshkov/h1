package test;

public class Operations {
public static void main(String[] args) {
	int a = 1 + 2;
	
	int b, c;
	a += 2; // a = a + 2;
	
	b = a++;  // b == a
	b = a--; // b == a
	b = ++a; // b == a + 1
	b = --a;// b == a - 1
	
	float f = 0.0f; 
	
	double d = 1.03;
	
	boolean bool = a>10;
	
	bool = a == 10;
	bool = b != 10;
	
	//bool a > 10 && b < 20;
	//bool a > 10 || b < 20;
	
	bool = !(a > 10);
	
	System.out.println(Math.PI);
	
	c = (int)d;
	
	c = (int)Math.ceil(d);
	
}
}
