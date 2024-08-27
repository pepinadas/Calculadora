package com.curso.v0.operaciones;
import com.curso.v0.operaciones.Interface.Operacion;
import com.curso.v0.operaciones.OperacionBase;

import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Operacion operacion = null;
        double resultado;
        String opcion="";

        do {
            System.out.println("Selecciona la operación: +, -, *, /");
            char oper = scanner.next().charAt(0);

            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

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
                    continue;
            }

            if (operacion != null) {
                resultado = operacion.ejecutar(num1, num2);
                System.out.println("El resultado es: " + resultado);
            }

            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            opcion = scanner.next();

        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();

    }
}