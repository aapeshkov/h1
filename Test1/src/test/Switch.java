package test;

public class Switch {
public static void main(String[] args) {
	
	int i = 10;
	
	switch (i) {
	case 1: {
		
			}
	break; //  в каждом case нужно ставить break, иначе программа продолжит выполнение 
	
	case 2:{
		
			}
	case 5:
	case 10:
		System.out.println("not one");
		break;
		
	default:
			System.out.println("sometjink strange");
		}
	
	
	}
}
