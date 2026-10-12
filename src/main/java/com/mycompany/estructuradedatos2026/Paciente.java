
package com.mycompany.estructuradedatos2026;

public class Paciente {
    //Atributos
    int numeroSeguroSocial;
    String nombreCompleto;
    byte edad;
    String SexoBiologico;
    int glucosa;
    float globulosRojos;
    float temperaturaCorporal;
    float dosisMedicamentoMl;
    boolean AlergicoPenicilina;
    
    //Constructor

    public Paciente(int numeroSeguroSocial, String nombreCompleto, byte edad, String SexoBiologico, int glucosa, float globulosRojos, float temperaturaCorporal, float dosisMedicamentoMl, boolean AlergicoPenicilina) {
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.SexoBiologico = SexoBiologico;
        this.glucosa = glucosa;
        this.globulosRojos = globulosRojos;
        this.temperaturaCorporal = temperaturaCorporal;
        this.dosisMedicamentoMl = dosisMedicamentoMl;
        this.AlergicoPenicilina = AlergicoPenicilina;
    }
    
    //Getter and Setters

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getSexoBiologico() {
        return SexoBiologico;
    }

    public void setSexoBiologico(String SexoBiologico) {
        this.SexoBiologico = SexoBiologico;
    }

    public int getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(int glucosa) {
        this.glucosa = glucosa;
    }

    public float getGlobulosRojos() {
        return globulosRojos;
    }

    public void setGlobulosRojos(float globulosRojos) {
        this.globulosRojos = globulosRojos;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public float getDosisMedicamentoMl() {
        return dosisMedicamentoMl;
    }

    public void setDosisMedicamentoMl(float dosisMedicamentoMl) {
        this.dosisMedicamentoMl = dosisMedicamentoMl;
    }

    public boolean isAlergicoPenicilina() {
        return AlergicoPenicilina;
    }

    public void setAlergicoPenicilina(boolean AlergicoPenicilina) {
        this.AlergicoPenicilina = AlergicoPenicilina;
    }
    
    
}
/*
     * Clase Paciente
     * numerosegurosocial
     * nombreCompleto
     * edad
     * sexobiologico
     * glucosa
     * globulosrojos
     * temperaturacorporal
     * dosisMedicamentoMl
     * esAlergicoPenicilina
     */