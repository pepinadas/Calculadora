package com.curso.v0.operaciones;

import java.util.Scanner;

import com.curso.v0.operaciones.Interface.Operacion;

import java.util.Scanner;

import static com.curso.v0.operaciones.Checked.isDouble;

public class Principal {

    public static void main(String[] args) {
        double num1, num2;
        num1 = 0;
        num2 = 0;
        if(args != null){
            if( args.length == 2){
                try {
                    num1 = Double.parseDouble(args[0]);
                    num2 = Double.parseDouble(args[1]);    
                } catch (Exception NumberFormatException) {
                    System.out.println("El valor ingresado no es numerico");
                }
            }
        }
        else{

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
            num1 = scanner.nextDouble();
    
            // Solicitar el segundo número
            System.out.print("Por favor, ingresa el segundo número: ");
            num2 = scanner.nextDouble();
        }

        Operacion operando = new Suma();
        System.out.println(operando.ejecutar(num1, num2));
    }

}
