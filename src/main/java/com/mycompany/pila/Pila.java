
package com.mycompany.pila;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pila {

    public static void main(String[] args) {
        
        Deque pilaO = new ArrayDeque<>(); // Pila de objetos  Object
        Deque<String> pila = new ArrayDeque<>(); // Pila de String
        
        //push: apilar elementos
        pila.push("Fresa");
        pila.push("Mango");
        pila.push("Manzana");
        pila.push("Mango");
        pila.push("Ciruela");
        pila.push("Tamarindo");
        //peek: ver la cima sin retirarlos
        System.out.println("Cima: " + pila.peek());
        //pop: desapilar
        System.out.println("retirado: " + pila.pop());
        System.out.println("Nueva cima: " + pila.peek());
        
        System.out.println("----- hay " + pila.size() + " frutas en la pila -----");
        while(!pila.isEmpty()){ //!pila.isEmpty()!= true
            System.out.println("procesado: " +pila.pop());
        }
        
        System.out.println("Ya no hay nada en la pila!!!!");
        
    }
}
