package com.curso.v0.operaciones;

import com.curso.v0.operaciones.Interface.Operacion;

public class Principal {

    public static void main(String[] args) {
        Operacion operando = new Suma();
        System.out.println(operando.ejecuta(1.1,2));
    }

}
