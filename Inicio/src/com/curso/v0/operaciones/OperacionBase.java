package com.curso.v0.operaciones;

import com.curso.v0.operaciones.Interface.Operacion;

public abstract class OperacionBase implements Operacion {
    public abstract double ejecutar(double a, double b);
}
