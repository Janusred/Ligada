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
public class Nodo {
    public int dato;
    public Nodo sig; // puunto de enlace
   // insertar al final
    public Nodo(int d){
        this.dato=d;
        this.sig=null;
    }
    // insertar al inicio
    public Nodo(int d, Nodo n){
        dato=d;
        sig=n;
        
    }
}
