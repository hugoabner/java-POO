package com.patterDesignBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();

        p.apellido = "Perez";
        p.nombre = "Juan";
        p.edad = 30;

        System.out.println(p.nombre);
        System.out.println(p.apellido);
        System.out.println(p.edad);
    }
}