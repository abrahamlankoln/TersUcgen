import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner deger = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz :");
		int n = deger.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * n - (2 * i + 1)); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
