/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_ejercicio_03_01;

/**
 *
 * @author Andy Abad
 */
public class POO_Ejercicio_03_01 {

    public static void main(String[] args)
    {
        Ventana1 v1=new Ventana1("Border Layuot");
        v1.setVisible(true);
        Ventana3 v3=new Ventana3("GridLayout");
        v3.setVisible(true);
        Ventana2 v2=new Ventana2("Flow Layout");
        v2.setVisible(true);
        Ventana4Bandera v4=new Ventana4Bandera("BorderLayout");
        v4.setVisible(true);
    }
}
