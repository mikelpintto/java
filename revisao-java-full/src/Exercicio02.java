import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double valor = sc.nextDouble();
		double raio = pi * (valor * 2);
		System.out.printf("Saida: %.4f%n", raio);
		sc.close();
		

	}

}
