package com.dio2;

import java.util.Locale;
import java.util.Scanner;

public class Sobregcarga {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do {
		System.out.println("Escolha um número para qual área deseja calcular:");
		System.out.print("Quadrado (1), Retangulo (2), Trapézio (3)");
		System.out.println("");
		char opc = sc.next().charAt(0);
		
		switch (opc) {
		case '1':
			System.out.println("Qual o tamanho do lado?");
			double lado = sc.nextDouble();
			calcularArea.area(lado);
			break;
		
		
		case '2': 
			System.out.println("Qual o tamanho dos lado A e B?");
			double lado1 = sc.nextDouble();
			double lado2 = sc.nextDouble();
			calcularArea.area(lado1, lado2);
			break;
			
		case '3': 
			System.out.println("Qual o tamanho dos lado Base1, base2 e altura?");
			double ladoA = sc.nextDouble();
			double ladoB = sc.nextDouble();
			double ladoC = sc.nextDouble();
			calcularArea.area(ladoA, ladoB, ladoC);
			break;
			
		default:
			System.out.println("Número inválido!");
			break;
			
		}
		System.out.println("");
		System.out.print("Deseja fazer outra operacão? (s/n)");
		System.out.println("");
		resp = sc.next().charAt(0);
		
		} while (resp == 's');
		
		
		
		sc.close();
	}
	
	public static class calcularArea{
		
		public static void area(double a) {
			
			double quadrado = a * a;
			System.out.println("A área do quadrado é: " + quadrado);
		}
		
		public static void area(double a, double b) {
			
			double retangulo = a * b;
			System.out.println("A área do retangulo é: " + retangulo);
		}
		
		public static void area(double a, double b, double c) {
			
			double trapezio = ((a+b)*c)/2;
			System.out.println("A área do trapézio é: " + trapezio);
		}
	}
}
