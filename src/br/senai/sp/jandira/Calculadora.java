package br.senai.sp.jandira;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		double[] entrada = new double[3];
		entrada = entradaDeDados();
		double resultado = 0;
		char sinal = ' ';
		
		if(entrada[0] == 1) {
		resultado =	somar(entrada[1], entrada[2]);
		sinal = '+';
		}else if(entrada[0] == 2) {
				resultado =	subtrair(entrada[1], entrada[2]);
				sinal = '-';
				}else if(entrada[0] == 3) {
						resultado =	multiplicar(entrada[1], entrada[2]);
						sinal = '*';
						}else if (entrada[0] == 4) {
								resultado =	dividir(entrada[1], entrada[2]);
								sinal = '/';
								}
		
		System.out.println();
		System.out.println("    " + entrada[1] + " " + sinal+ " " + entrada[2] + " = " + resultado);
		
		
						}
			
	
	//método de entrada de dados
	public static double[] entradaDeDados() {
		Scanner teclado = new Scanner(System.in);
		double matriz [] = new double[3];
		
		System.out.println("+--------------------+");
		System.out.println("| CALCULADORA BÁSICA |");
		System.out.println("+--------------------+");
		System.out.println("\nDigite o número correspondente à operação escolhida:");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.print("-->");

		matriz[0] = teclado.nextDouble();
		
		System.out.print("\nDigite o 1º valor ");
		matriz[1] = teclado.nextDouble();
		
		System.out.print("Digite o 2º valor: ");
		matriz[2] = teclado.nextDouble();

		
		
		while (true) {
			System.out.print("Digite o 2º valor: ");
			matriz[2] = teclado.nextDouble();
			if(!(matriz[0] == 4 && matriz[2] == 0)) {
				break;
			}
		}
		
		/*while (true) {
			System.out.print("Digite o 2º valor: ");
			matriz[2] = teclado.nextDouble();
			if(matriz[0] == 4 && matriz[2] == 0) {
				System.out.println("NÃO É POSSÍVEL DIVIDIR POR 0. ESCOLHA OUTRO VALOR.");
			}else {
				break;
			}
		}*/
		
		/*if(matriz[0]==4) {
			while(matriz[2] == 0) {
				System.out.println("Não é possível dividir por 0, por favor, escolha outro valor.");
				matriz[2] = teclado.nextDouble();
			}
		}*/
		
		return matriz;
	}
	
	public static double somar(double v1, double v2) { 
		return v1 + v2;
	}
	public static double subtrair(double v1, double v2) { 
		return v1 - v2;
	}
	public static double multiplicar(double v1, double v2) { 
		return v1 * v2;
	}
	public static double dividir(double v1, double v2) { 
		return v1 / v2;
	}
}
