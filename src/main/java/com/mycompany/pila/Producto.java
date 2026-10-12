
package com.mycompany.pila;

public class Producto {
    
    private String nombre;
    private double precio;
    private String marca;
    private int stock;

    
    public Producto(){
    }
    
    public Producto(String nombre, String marca, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
    }
    @Override
    public String toString(){
        return "Producto("+"nombre"+nombre+",precio"+precio+",marca"+marca+",stock"+stock+')';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
}
