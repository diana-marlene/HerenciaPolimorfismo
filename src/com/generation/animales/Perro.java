package com.generation.animales;

public class Perro extends Animal implements Mascota,Mamiferos{
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
    }
    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void jugar(){
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzz");

    }

    @Override
    public void hablar() {
        System.out.println("GUafff");

    }

    public void ladrar(){
        System.out.println("Guauf");
    }

    public void comer(String alimento) {
        System.out.println("Estoy comiendo ");
    }
    @Override
    public void respirar() {

    }

    @Override
    public void gestacion() {

    }

    @Override
    public void ingestarleche() {

    }

    @Override
    public void movilidad() {

    }
}