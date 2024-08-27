package com.curso.v0.operaciones;

class Division extends OperacionBase {
    @Override
    public double ejecutar(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
    }
}
