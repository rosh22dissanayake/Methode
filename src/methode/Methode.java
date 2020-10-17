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
     
        int k = my(20,10,30);
        System.out.println("Multification is="+k);
        
    }
    
    public static int my(int a, int b,int c){
        int result=a*b*c;
       
        
        return result;
    }
}


