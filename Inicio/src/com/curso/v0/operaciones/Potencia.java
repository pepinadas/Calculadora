package com.curso.v0.operaciones;

import com.curso.v0.operaciones.Interface.Operacion;

public class Potencia implements Operacion {


    @Override
    public double ejecuta(double x, double y) {
        return (double)(Math.pow(x, y));
    }
}