/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methode;

/**
 *
 * @author Chathani
 */
public class Methode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int r = my(20,10,5);
        System.out.println("Result is="+r);
        
    }
    
    public static int my(int p, int q,int r){
        int d = p*p - 4*q*r;
       
        
        return d;
    }
}


