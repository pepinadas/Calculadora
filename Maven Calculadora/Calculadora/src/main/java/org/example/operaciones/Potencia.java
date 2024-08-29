package org.example.operaciones;


import org.example.operaciones.Interface.Operacion;

public class Potencia implements Operacion {


    @Override
    public double ejecutar(double x, double y) {
        return (double)(Math.pow(x, y));
    }
}