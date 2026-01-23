/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.animals;

import Models.*;

/**
 *
 * @author Dell
 */
public class Animals {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        animal.Keu();
        Animal_2chi haichi = new Animal_2chi("2 chi");
        Animal_4chi bonchi = new Animal_4chi("4 chi");
        Chicken chicken = new Chicken("Chicken");
        chicken.Keu();
        Duck duck = new Duck("Duck");
        duck.Keu();
        Conco co = new Conco("Co");
        co.Keu();

        Animal ani1 = new Animal("Ani1");
        Animal ani2 = new Chicken("Ani2");
        Animal ani3 = new Duck("Ani3");
        Animal ani4 = new Conco("Ani4");
        ani1.Keu();
        ani2.Keu();
        ani3.Keu();
        ani4.Keu();
        
    }
}
