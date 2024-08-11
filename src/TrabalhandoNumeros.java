import java.util.Scanner;

public class TrabalhandoNumeros {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		double divisao;
		int multiplicacao;
		
		System.out.println("Calculadora");
		System.out.println("Digite o primeiro valor:");

		valor1 = leitor.nextInt();
		
		System.out.println("Digite o segundo valor:");
		
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double)valor2;
		
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A subtracao dos valores é: " + subtracao);
		System.out.println("A multiplicação dos valores é: " + multiplicacao);
		System.out.println("A divisão dos valores é: " + divisao);
	}

}
