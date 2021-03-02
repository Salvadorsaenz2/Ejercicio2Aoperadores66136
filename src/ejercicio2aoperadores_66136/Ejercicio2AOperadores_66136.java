/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2aoperadores_66136;

/**
 *
 * @author salva
 */
public class Ejercicio2AOperadores_66136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    	
        int[] [] val = new int [3][3];
        
        val [0][0] = 2;
        val [0][1] = 6;
        val [0][2] = 50;
        
        val [1][0] = 4;
        val [1][1] = 5;
        val [1][2] = 9;
        
        val [2][0] = 15;
        val [2][1] = 26;
        val [2][2] = 28;
        
        int determinante = (val[0][0]*val[1][1]*val[2][2]-val[0][2]*val[1][1]*val[2][0]);
        
        System.out.println("determinante = " + determinante);
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
