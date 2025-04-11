import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("digite seu nome:");
			String nome = sc.nextLine();
			System.out.print("digite sua idade:");
			int idade = sc.nextInt();
			System.out.print("digite sua altura:");
			double altura = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("O campo de altura deve conter um '.' como separadore a idade deve ser numérica.");
			System.out.print("digite seu nome:");
			String nome = sc.nextLine();
			System.out.print("digite sua idade:");
			int idade = sc.nextInt();
			System.out.print("digite sua altura:");
			sc.nextLine();
			double altura = sc.nextDouble();
		}
		
		
		sc.close();
	}

}
