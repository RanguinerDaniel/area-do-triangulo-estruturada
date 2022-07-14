import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Declared according to oracle conventions - Java (6.1 Number Per Line | 6.2
		// Placement)
		float xA;
		float xB;
		float xC;
		float yA;
		float yB;
		float yC;
		float p;

		System.out.println("Digite as medidas do triângulo X: ");
		xA = sc.nextFloat();
		xB = sc.nextFloat();
		xC = sc.nextFloat();

		System.out.println("Digite as medidas do triângulo Y: ");
		yA = sc.nextFloat();
		yB = sc.nextFloat();
		yC = sc.nextFloat();

		p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Área do triângulo X: %.4f", areaX);
		System.out.printf("Área do triângulo Y: %.4f", areaY);

		if (areaX > areaY) {
			System.out.println("o triângulo X possui a maior área.");
		} else if (areaX == areaY) {
			System.out.println("Os triângulos X e Y possuem áreas iguais.");
		} else {
			System.out.println("O triângulo Y possui a maior área.");
		}
		sc.close();

	}
}
