/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author artur
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];
        
        l[0]= new Lutador("Pretty Boy", "França",31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript","Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow","EUA", 35, 1.65F, 80.9f, 12 , 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 12, 2, 1);
        l[4] = new Lutador("UFOCobol","Brazil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Neardaat", "Eua", 30, 1.81f, 105.7f, 12, 2,4);
        l[3].ganharLuta();
        l[3].empatarLuta();
        l[3].status();
    }
    
}
