package com.curso.v0.operaciones;

public class Checked {

    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double isNotNumeric() {
        System.out.println("Este no es un numerico, se usara por defecto 0");
        return 0;
    }
}
