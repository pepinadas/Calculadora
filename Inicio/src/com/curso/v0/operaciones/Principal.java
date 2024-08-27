package com.curso.v0.operaciones;

import java.util.Scanner;
import com.curso.v0.operaciones.Interface.Operacion;

public class Principal {

    public static void main(String[] args) {
        String opcion="s";
        double num1 = 0, num2 = 0;
        double resultado;

        if(args.length > 0){
            if(args.length == 2){
                try {
                    num1 = Double.parseDouble(args[0]);
                    num2 = Double.parseDouble(args[1]);    
                } catch (NumberFormatException e) {
                    System.out.println("El valor ingresado no es numérico");
                    return;
                }
            }
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("╔═════════════════════════════════════╗");
            System.out.println("║      Bienvenid@ a la Calculadora    ║");
            System.out.println("╚═════════════════════════════════════╝");

            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("\n¡Hola, " + nombre + "! Vamos a realizar algunas operaciones matemáticas.\n");

            Operacion operacion = null;

            Bob: do {
                // Seleccionar el tipo de operacion
                System.out.println("Selecciona la operación: +, -, *, /");
                char oper = scanner.next().charAt(0);
                scanner.nextLine();

                switch (oper) {
                    case '+':
                        operacion = new Suma();
                        break;
                    case '-':
                        operacion = new Resta();
                        break;
                    case '*':
                        operacion = new Multiplicacion();
                        break;
                    case '/':
                        operacion = new Division();
                        break;
                    default:
                        System.out.println("Operación no válida");
                        continue Bob;
                }

                // Solicitar el primer número
                System.out.print("Por favor, ingresa el primer número: ");
                String tmp1 = scanner.nextLine();
                if (Checked.isDouble(tmp1)) {
                    num1 = Double.parseDouble(tmp1);
                } else {
                    System.out.println("El valor ingresado no es numérico");
                    continue Bob;
                }

                // Solicitar el segundo número
                System.out.print("\nPor favor, ingresa el segundo número: ");
                String tmp2 = scanner.nextLine();
                if (Checked.isDouble(tmp2)) {
                    num2 = Double.parseDouble(tmp2);
                } else {
                    System.out.println("El valor ingresado no es numérico");
                    continue Bob;
                }

                



                if (operacion != null) {
                    resultado = operacion.ejecutar(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                }

                System.out.print("¿Deseas realizar otra operación? (s/n): ");
                opcion = scanner.next();

            } while (opcion.equalsIgnoreCase("s"));
        }
    }
}
