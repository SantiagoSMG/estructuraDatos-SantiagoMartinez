
package com.mycompany.pila.listas;

public class ListaEnlazada {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaEnlazada(){
        this.inicio=null;
        this.fin=null;
    }
    
    public void agregarInicio(String val){
        
        
     if(this.inicio==null && this.fin==null){
         inicio=new Nodo(val,inicio);
         fin=inicio;
     }else{
         inicio=new Nodo(val,inicio);
    }
    }
    
    public void mostrarLista(){
        Nodo aux= this.inicio;
        while(aux !=null){
            System.out.println("["+aux+"]-->");
            aux = aux.siguiente;
        }
        
    }
    
    public int cantidadNodos(){
        Nodo aux = this.inicio;
        int cantidad=0;
        while(aux !=null){
            cantidad++;
            aux = aux.siguiente;
        }
        return cantidad;
    }
   
    public void agregarFinal(String val){
        if(inicio == null && fin == null){
            inicio = new Nodo(val);
            fin = inicio;
        }else{
            fin.siguiente = new Nodo(val);
            fin = fin.siguiente;
        }
    }
}
