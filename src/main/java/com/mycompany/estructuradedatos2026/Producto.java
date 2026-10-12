
package com.mycompany.estructuradedatos2026;


public class Producto {
    //atributos
    long id = 2893257; //int
    String nombre = "TV Samsung";
    String sku;
    char talla;  //S,M,L
    byte pasillo;
    short loteAnio;
    int stokDisponible;
    float pesoKg;
    double precioUnitario;
    boolean activo;
    
    //Constructor
    public Producto(String sku, char talla, byte pasillo, short loteAnio, int stokDisponible, float pesoKg, double precioUnitario, boolean activo) {
        this.sku = sku;
        this.talla = talla;
        this.pasillo = pasillo;
        this.loteAnio = loteAnio;
        this.stokDisponible = stokDisponible;
        this.pesoKg = pesoKg;
        this.precioUnitario = precioUnitario;
        this.activo = activo;
    
    
    //Getters and setters
    }

    Producto(int i, String playera_Maja_Verde, String pmvM01, char c, byte b, short s, int i0, float f, double d, boolean b0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Producto(int i, String playera_Maja_Verde, String pmvM01, char c, byte b, int i0, float f, double d, boolean b0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public byte getPasillo() {
        return pasillo;
    }

    public void setPasillo(byte pasillo) {
        this.pasillo = pasillo;
    }

    public short getLoteAnio() {
        return loteAnio;
    }

    public void setLoteAnio(short loteAnio) {
        this.loteAnio = loteAnio;
    }

    public int getStokDisponible() {
        return stokDisponible;
    }

    public void setStokDisponible(int stokDisponible) {
        this.stokDisponible = stokDisponible;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}