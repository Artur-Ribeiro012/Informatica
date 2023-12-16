/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operadores Aritmeticos
        int a,b,c;
        a = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor A"));
        b = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor B"));
        c = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor C"));
        System.out.println("Operadores");
        System.out.println(a + " + "+ b + " = " + (a + b));
        System.out.println(a + " - "+ b + " = " + (a - b));
        System.out.println(a + " * "+ b + " = " + a * b);
        System.out.println(a + " / "+ b + " = " + a / b);
        System.out.println(a + " expoente "+ b + " = " + Math.pow(a,b));
        System.out.println(a + " % " + b + " = " + a % b);
        System.out.println("Operadores Relacionais");
        System.out.println(a + " = " + b + " " + (a == b));
        System.out.println(a + " < " + b + " " + (a < b));
        System.out.println(a + " > " + b + " " + (a > b));
        System.out.println(a + " >= " + b + " " + (a >= b));
        System.out.println(a + " <= " + b + " " + (a <= b));
        System.out.println(a + " != " + b + " " + (a != b));
        System.out.println("Operadores Lógicos");
        System.out.println(a + " == " + b + " e b>c" + "\t= " +(a==b && b>c));
        System.out.println(a + " != " + b + " ou b>c" + "\t=" +(a!=b || b>c));
        System.out.println(a + " > " + b + " nao" + "\t= " + !(a>b));
        System.out.println(a + " < " + b + " e b>c" + "\t= " + (a < b && b > c));
        System.out.println(a + " <= " + b + " nao " +" = "+!(a<=b));
    }
    
}
