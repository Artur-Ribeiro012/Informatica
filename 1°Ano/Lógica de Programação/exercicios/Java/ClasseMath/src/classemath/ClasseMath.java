/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

/**
 *
 * @author artur
 */
public class ClasseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1 = 123.6;
        double n2 = 1.0;
        System.out.println("\nExp (" +n2+ ")\t= "+Math.exp(n2));
        System.out.println("\nABS ("+n1+ ")\t= "+Math.abs(n1));
        System.out.println("\nRaiz ("+n1+")\t= "+Math.sqrt(n1));
        System.out.println("\nLog ("+n2 * 1000 + ")\t= "+Math.log(n2*1000));
        System.out.println("\nCos ("+n1+")\t= "+Math.cos(n1));
    }
    
}
