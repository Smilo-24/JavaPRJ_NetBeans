/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj03_ripasso;

import java.util.Scanner;

/**
 *
 * @author B22-233-2023
 */
public class Esercizio {
    public static void main(String[] args) {
        
        //Esercizio sulla somma di 4 valori usando 2 variabili
        Scanner sc = new Scanner (System.in);
        int somma=0;
        int num=0;
        
        //cosi è usando 2 variabili
        System.out.println("Inserisci un numero intero");
        num=sc.nextInt();
        somma+=num;
        
        //Cosi è sempre giusto ma uso una sola variabile
        System.out.println("Inserisci un numero intero");
        somma+=sc.nextInt();
        System.out.println("Inserisci un numero intero");
        somma+=sc.nextInt();
        System.out.println("Inserisci un numero intero");
        somma+=sc.nextInt();
        System.out.println("Il totale e' " + somma);
        

        
        
        
       
       
        
                
    }
}
