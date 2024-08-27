package com.curso.v0.operaciones;

import com.curso.v0.operaciones.Interface.Operacion;

public class Multiplicacion extends OperacionBase {
    @Override
    public double ejecutar(double a, double b) {
        return a * b;
    }
}