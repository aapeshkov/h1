package Lesson182303;

import java.util.Arrays;

public class Arrays7 {
	public static void main(String[] args) {
		
		int[] a = new int[20];
		
		fillRandoms(a);
		
		Arrays.sort(a); //сортируем
		
	int index =	Arrays.binarySearch(a, 20); // ищем число 20 в массиве
		
		// Sort: primitive types: TimSort (Quick Sort variant)
		//Sort: object types: MergeSort для ссылок, ребуется дополнительное пространство
		
		System.out.println(Arrays.toString(a));// приводим в тип стринг и на экран
	System.out.println(index);
	
	}
	

	private static void fillRandoms(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*40);
		}
		
		
	}
}
