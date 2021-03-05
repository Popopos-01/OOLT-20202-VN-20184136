package ex5_4;
//import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		//Scanner keyboard = new Scanner(System.in);
		//System.out.println("Nhap n: ");
		//n = keyboard.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) 
				System.out.print(" ");
			for(int k = 1; k < 2*i; k++)
				System.out.print("*");
			System.out.print("\n");
		}
		//keyboard.close();
	}

}
