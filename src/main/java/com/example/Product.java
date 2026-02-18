package com.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    public Product() {
        id = null;
        name = null;
        price = 0.0;
        stock = 0;
    }

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;

    }

    public String getIdAtributo() {
        return id;
    }

    public String getNombreAtributo() {
        return name;
    }

    public double getPriceAtributo() {
        return price;
    }

    public int getStockAtributo() {
        return stock;
    }

    public void setIdAtributo(String id) {
        this.id = id;
    }

    public void setNombreAtributo(String name) {
        this.name = name;
    }

    public void setPriceAtributo(double price) {
        if (price > 0) {
            this.price = price;
        }else{
            System.out.println("el numero ingresado debe ser positivo");
        }
    
    }
    public void setStockAtributo(int stock) {
        
         if (stock > 0) {
            this.stock = stock;
        }else{
            System.out.println("el numero ingresado debe ser positivo");
        }
    }
     public String toString(){
            return "producto " + "id: "+ id + " nombre: "+ name + " precio:"+ price + " inventrio:" + stock;
         }
}
