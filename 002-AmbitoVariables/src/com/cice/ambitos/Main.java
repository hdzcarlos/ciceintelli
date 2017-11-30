/*
 * Mostramos el funcionamiento de los ambitos de uso de las variables
 */
package com.cice.ambitos;

/**
 * Clase principal...
 * Metodo Mein.
 */
public class Main {
    // Variable local de la clase, accesible desde cualquier metodo si la variable es estatica se puede acceder desde cualquiera estatico , y si no es estatica pueden acceder desde cualquier metodo.
    int numeroClase; 
    
    public static void main(String[] args){
        
        // Variable local del metodo
        
        int numero = 0;
        
        numero = 2; 
        
        if (numero == 0){
            numero = 3; 
            
         }
        // terminar el codigo
        //Main principal = new Main ();
       //principal
        
        }
    
    /**
     * Metodo de prueba
     */
    public void clasePrueba(){
        numeroClase = 76;
        int numero = 3;
        
        System.out.println(numero);
        
               
      
    }
       
      
    }
    
    
 
