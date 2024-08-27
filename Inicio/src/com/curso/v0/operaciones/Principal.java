package com.curso.v0.operaciones;

import com.curso.v0.operaciones.Interface.Operacion;

import java.util.Scanner;

import static com.curso.v0.operaciones.Checked.isDouble;

public class Principal {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String numero1 = scanner.nextLine();
        String numero2 = scanner.nextLine();


        Double numeroParseado = null;


        if (isDouble(numero1)) {
            numeroParseado = Double.parseDouble(numero1);
            System.out.println("Has introducido un número decimal: " + numeroParseado);
        }
        // Si no es un número, es texto
        else {
            System.out.println("Por favor introduce algo valido");
        }






        Operacion operando = new Dividir();
        System.out.println(operando.ejecuta(1.1,0));

        scanner.close();
    }

}
