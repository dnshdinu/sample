package programs;

public class Triangle {
	 public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <=5-i; j++) {
				
				System.out.print("* ");
			}
			for (int K = 1; K<=i; K++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		 
	}

}
