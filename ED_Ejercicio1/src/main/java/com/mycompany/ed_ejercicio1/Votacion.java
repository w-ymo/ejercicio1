/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed_ejercicio1;

/**
 *
 * @author Peripito
 */
public class Votacion {

    private String nombre;
    private Integer numero;

    public Votacion() {
    }

    public Votacion(String nombre, Integer numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Votacion{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }

}
