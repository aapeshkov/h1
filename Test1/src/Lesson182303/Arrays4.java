package Lesson182303;

public class Arrays4 {
public static void main(String[] args) {
	
	int a[][] = {
			{1,2,0,3,  10, 39, 0, 90},
			{1,6,3},
			{1,8,9, 8 , 0, 9},
		};
	
	int zeroes = countZeroes(a);
	
	System.out.println(zeroes);
	
}

private static int countZeroes(int[][] a) {
	// TODO Auto-generated method stub
	
	int n = 0;
	
	OUTER:
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if (a[i][j] == 0) {
				n++;
				continue OUTER; 
			}
		}
	}
	
	return n;
}
}
