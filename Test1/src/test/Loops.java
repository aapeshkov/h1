package test;

public class Loops {
public static void main(String[] args) {
	int[] a = {1,2,3};
	
	printArray(a);
}

private static void printArray(int[] a) {
	
	for (int i = 0; i<a.length; i++) { // этот
		
		int j = a[i];
		System.out.println(j);
	}
	
	for (int x : a ) { // эквивалентен этому
		System.out.println(x);
	} //
	int i = 0;
	while (i < a.length) {
		a[i] = i;
		System.out.println(a[i]);
		i++;
	}
	}
}


