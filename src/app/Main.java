package app;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.print("Numero a convertir(Decimal): ");
		int n = keyBoard.nextInt();
		System.out.print("Numero de la Base: ");
		int b = keyBoard.nextInt();
		
		if (n==0) {
			System.out.println("\n0");
		}else  if (b ==0){
			System.out.println("\nNo Se Puede Resolver");
		}else{
			System.out.println("\n"+Convert.convertTo(n, b));
		}
	}

}
