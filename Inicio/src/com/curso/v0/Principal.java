package com.curso.v0;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║      Bienvenid@ a la Calculadora    ║");
        System.out.println("╚═════════════════════════════════════╝");

		System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Saludar al usuario
        System.out.println("\n¡Hola, " + nombre + "! Vamos a realizar algunas operaciones matemáticas.\n");

        // Solicitar el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        // Solicitar el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
		
	}

}

