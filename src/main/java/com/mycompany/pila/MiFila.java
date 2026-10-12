
package com.mycompany.pila;
import java.util.LinkedList;
import java.util.Queue;

public class MiFila {

    public static void main(String[] args) {
        //cola oxxo instanciada e inicializada
        Queue<String> colaOXXO = new LinkedList<>();
        
        //offer: agregar un elemento a la cola
        colaOXXO.offer("Maria");
        colaOXXO.offer("Pepe");
        colaOXXO.offer("Juan");
        colaOXXO.offer("Ana");
        colaOXXO.offer("Carlos");
        
        System.out.println("Siguiente: ");
        System.out.println(colaOXXO.peek());
        
        System.out.println("Atendido: ");
        System.out.println(colaOXXO.poll());
        
        System.out.println("\nQuedan: ");
        System.out.println(colaOXXO.size());
        
        System.out.println("\nEsta vacia?: "+colaOXXO.isEmpty());
        System.out.println(colaOXXO);
                
    }
    
}
