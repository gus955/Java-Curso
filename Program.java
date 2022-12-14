package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		retangulo rect = new retangulo();

		System.out.println("Insert values for height and width");
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		
		System.out.printf("AREA= %.2f%n", rect.area());
		System.out.printf("PERIMETRO= %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL= %.2f%n", rect.diagonal());
		
		
		sc.close();
	}

}
