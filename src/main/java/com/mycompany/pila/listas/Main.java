
package com.mycompany.pila.listas;


public class Main {

   
    public static void main(String[] args) {
        
    ListaEnlazada listaAlumnos = new ListaEnlazada();
      
        
    listaAlumnos.agregarInicio("Juanito");
    listaAlumnos.agregarInicio("Maria");
    listaAlumnos.agregarFinal("Lupita");
    listaAlumnos.agregarFinal("Carlos");
        
        System.out.println("Tamaño: "+ listaAlumnos.cantidadNodos());
        listaAlumnos.mostrarLista();
    }
    
    
}
