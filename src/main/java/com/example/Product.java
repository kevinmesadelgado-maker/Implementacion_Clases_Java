package com.example;

public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;

    public Product() {
    }

    public Product(String id, String name, double price, int stock) {
        setId(id);
        setPrice(price);   
        setStock(stock);  
        setName(name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

  
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }
        this.price = price;
    }

    public void setStock(int stock) {
        if (stock <= 0) {
            throw new IllegalArgumentException("El stock debe ser positivo");
        }
        this.stock = stock;
    }

     public String toString(){
            return "producto " + "id: "+ id + " nombre: "+ name + " precio:"+ price + " inventario:" + stock;
         }
}
