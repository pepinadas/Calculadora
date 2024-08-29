package org.example.operaciones;


import org.example.operaciones.Interface.Operacion;

public abstract class OperacionBase implements Operacion {
    public abstract double ejecutar(double a, double b);
}
