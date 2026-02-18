package com.example;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("1","pelota",23.23,10);

    
        p1.setId("2");
        p1.setPrice(20);

        System.out.println("Nombre p1: " + p1.getName());
        System.out.println("Precio p1: " + p1.getPrice());

        System.out.println(p1);


        System.out.println("---------------");

        Product p2 = new Product();

        p2.setId("3");
        p2.setName("cuaderno");
        p2.setPrice(15.50);
        p2.setStock(20);

        System.out.println("Nombre p2: " + p2.getName());
        System.out.println("Stock p2: " + p2.getStock());

        System.out.println(p2);
    }
}
