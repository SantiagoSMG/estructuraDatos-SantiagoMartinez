
package com.mycompany.estructuradedatos2026;


public class BoletoAvion {
    //atributos
    long numeroTicket;
    int codigoReserva;
    short asientoFila;
    char asientoLetra;
    double distanciaKm;
    float altitud;
    float pesoEquipajeKg;
    double precioBoleto;
    boolean IncluyeEquipajeDeMano;
    
    //Constructor

    public BoletoAvion(long numeroTicket, int codigoReserva, short asientoFila, char asientoLetra, double distanciaKm, float altitud, float pesoEquipajeKg, double precioBoleto, boolean IncluyeEquipajeDeMano) {
        this.numeroTicket = numeroTicket;
        this.codigoReserva = codigoReserva;
        this.asientoFila = asientoFila;
        this.asientoLetra = asientoLetra;
        this.distanciaKm = distanciaKm;
        this.altitud = altitud;
        this.pesoEquipajeKg = pesoEquipajeKg;
        this.precioBoleto = precioBoleto;
        this.IncluyeEquipajeDeMano = IncluyeEquipajeDeMano;
    }
    
    //Getter and Setters

    public long getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(long numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public short getAsientoFila() {
        return asientoFila;
    }

    public void setAsientoFila(short asientoFila) {
        this.asientoFila = asientoFila;
    }

    public char getAsientoLetra() {
        return asientoLetra;
    }

    public void setAsientoLetra(char asientoLetra) {
        this.asientoLetra = asientoLetra;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public float getAltitud() {
        return altitud;
    }

    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }

    public float getPesoEquipajeKg() {
        return pesoEquipajeKg;
    }

    public void setPesoEquipajeKg(float pesoEquipajeKg) {
        this.pesoEquipajeKg = pesoEquipajeKg;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public boolean isIncluyeEquipajeDeMano() {
        return IncluyeEquipajeDeMano;
    }

    public void setIncluyeEquipajeDeMano(boolean IncluyeEquipajeDeMano) {
        this.IncluyeEquipajeDeMano = IncluyeEquipajeDeMano;
    }
    
    
    
}
/** CLASE BoletoAvion
     * numeroTicket
     * codigoRserva
     * asientoFila
     * asientoLetra
     * distacniaKm
     * altitud
     * pesoEquipajeKg
     * precioBoleto
     * IncluyeEquipajeDeMano
     */