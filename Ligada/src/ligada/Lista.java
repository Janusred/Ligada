/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligada;

/**
 *
 * @author redlds
 */
public class Lista {
    protected Nodo incio,fin;// indica principio y final
    public Lista(){
        incio=null;
        fin=null;
    }
    //Metodo saber si la lista esta vacia
    public boolean Vacia(){
        if(incio==null){
            return true;
        }else{
            
        }
        return false;
            
        
    } 
    //metodo agragar un nodo al inicio de la lista
    public void agregarI(int elemento){
        // crear nodo
        incio =new Nodo(elemento, incio);
        if(fin==null){
            fin=incio;
        }
    }
    //metodo insertar al final de la lista
    public void Agregarfin(int elemento){
        if (!Vacia()){
            fin.sig=new Nodo(elemento);
            fin=fin.sig;
        }else{
            incio=fin=new Nodo(elemento);
        }
    } 
    //metodo para imprimir datos
    public void imprimir(){
        Nodo next=incio;
        while (next!=null){
            System.out.print("["+next.dato+"]>>");
            next=next.sig;
        }
    }
    
}
