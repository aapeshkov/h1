package Lesson182303;

public class Arrays3 {
public static void main(String[] args) {
	
	int a[][] = {
			{1,2,3},
			{1,6,3},
			{1,8,9},
		};
		
	int x = indexOfSum(a, 10);
	System.out.println(x);
	}

private static int indexOfSum(int[][] a, int max) {
	int sum = 0;
	
	int n = -1;
	
	OUTER:
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			n++;
			sum += a[i][j];
			if (sum > max) {
				break OUTER;
			}
		}
	}
	
	
	// TODO Auto-generated method stub
	return n;
}
}
