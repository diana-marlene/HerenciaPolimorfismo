package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.ConductorUber;
import com.generation.uber.ConductorUberBlack;
import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {
        //Ave ave = new Ave("Piolin");
        //System.out.println(ave.getNombre());
        //ave.comunicarse();
        //ave.comer();

        //System.out.println("-----------------------");
        //Perro lomito = new Perro("Coraje");
        //lomito.jugar();
        //lomito.comer("Croquetas");

        UberDriver driver = new ConductorUber();
        ConductorUberBlack driverBlack = new ConductorUberBlack();
        System.out.println("Uber");
        System.out.println(driver.calculatePrice(6));
        System.out.println("Uber Black");
        System.out.println(driverBlack.calculatePrice(6));

    }
}