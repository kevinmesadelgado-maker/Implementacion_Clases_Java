package com.example;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("1","pelota",23.23,10);

    
        p1.setIdAtributo("2");
        p1.setPriceAtributo(20);

        System.out.println("Nombre p1: " + p1.getNombreAtributo());
        System.out.println("Precio p1: " + p1.getPriceAtributo());

        System.out.println(p1);


        System.out.println("---------------");

        Product p2 = new Product();

        p2.setIdAtributo("3");
        p2.setNombreAtributo("cuaderno");
        p2.setPriceAtributo(15.50);
        p2.setStockAtributo(20);

        System.out.println("Nombre p2: " + p2.getNombreAtributo());
        System.out.println("Stock p2: " + p2.getStockAtributo());

        System.out.println(p2);
    }
}
