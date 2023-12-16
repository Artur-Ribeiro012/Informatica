/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idade;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final short DIAS_NO_ANO = 365;
        final short DIAS_NO_MES = 30;
        short dias;
        short meses;
        short anos;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe sua idade. ");
        System.out.print("Anos: ");
        anos = leitor.nextShort();
        
        System.out.print("Meses: ");
        meses = leitor.nextShort();
        
        System.out.print("Dias: ");
        dias = leitor.nextShort();
        dias += (anos*DIAS_NO_ANO)+(meses*DIAS_NO_MES);
        
        System.out.println("\n \nA sua idade é " + dias);
    }
    
}
