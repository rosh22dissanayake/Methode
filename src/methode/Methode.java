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
     
        int q = demo(5,7,9,10);
        System.out.println("Result is="+q);
        
    }
    
    public static int demo(int x, int y,int z,int k){
        int r = x*y*z*k;
       
        
        return r;
    }
}


