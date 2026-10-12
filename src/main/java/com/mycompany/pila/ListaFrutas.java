
package com.mycompany.pila;
import java.util.ArrayList;

public class ListaFrutas {


    public static void main(String[] args) {
        
        //ArrayList: se utiliza para listas
        ArrayList lista = new ArrayList();
        
        //add(valor): agregar un elemento
        lista.add("Manzana");
        lista.add("Mango");
        lista.add("Durazno");
        lista.add(0, "Pera");
        
        
        //get(): obtener un elemento segun su indice
        System.out.println("fruta: " +lista.get(2));
        
        //set(): cambiar valor de un elemento
        lista.set(1,"Mango Manila");
        
        lista.remove("Pera");
        System.out.println(lista);
        
        if(lista.contains("Manzana")){
            System.out.println("Si hay Manzanas");
        }else{
            System.out.println("No hay Manzanas");
        }    
        
        //size() tamaño del arraylist
        System.out.println("hay: "+lista.size()+ " frutas.");
        //empty(): verefica si el arraylist esta vacio
        System.out.println(lista.isEmpty());
        
        //foreach
        for(Object fruta : lista){
            System.out.println(fruta);
        }
        
        //for moderno
        lista.forEach((f)->{ System.out.println(f);});
        
        //for clasico
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //clear() limpia el arrayList
        lista.clear();
        System.out.println(lista);
        
    }
    
}
