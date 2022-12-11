import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o valor de X");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.print("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.print("Segundo");
			} else if (x > 0 && y < 0) {
				System.out.print("Terceiro");
			} else {
				System.out.print("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.print("Nulo");
		}

	}

}