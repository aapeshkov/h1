package Lesson182303;

import java.util.Arrays;

public class Arrays5 {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	
	int b[] = new int[a.length]; // ������ ���������� �����, �� �� ���������� �� ��������
	
	System.out.println(Arrays.toString(a));
	
	System.arraycopy(a, 0, b, 0, a.length); // ��� ����������, � ������ ��������, ���� ����������, � ������ ��������, ����� �����
	
	System.out.println(Arrays.toString(b));
	
}
}
