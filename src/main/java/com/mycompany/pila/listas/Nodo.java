
package com.mycompany.pila.listas;


public class Nodo {
    String valor;
    Nodo siguiente;
    
    public Nodo(String v, Nodo sig){
        this.valor = v;
        this.siguiente = sig;
    }
    public Nodo(String v){
        this.valor = v;
        this.siguiente = null;
    }
}
