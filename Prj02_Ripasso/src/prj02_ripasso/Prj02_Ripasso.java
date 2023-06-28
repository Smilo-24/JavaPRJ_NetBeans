/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj02_ripasso;

import java.util.Scanner;

/**
 *
 * @author B22-233-2023
 */
public class Prj02_Ripasso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int x=10;
        System.out.println(++x);//pre incremento
        System.out.println(x);
        System.out.println(x++);//post incremento
        
        //è la stessa cosa di fare x=x+1 ; ma in programmazione non ha senso ripetersi
        x+=3; //sta a dire x = x+3
        
        
        
        //operatore modulo
        
        //torna il resto della divisione
        
        int y=10;
        
        int resto=y%2;
        
        System.out.println(resto);
        
        //il resto è 0 poiché è pari oppure è divisibile per il numero dato
        //se fosse ad esempio 15%3: sarebbe zero anche se il ris è dispari etc
        
        
        
        
        //------------------CLASSI WRAPPER------------------//
        
        
        Integer numero=10;
        Double virgola=3.14;
        Float i=3.14F;
        Boolean b=true;
        Character c='@';
        
        
        int valore=Integer.parseInt("10");//converte una strina in un numero
        valore++;
        System.out.println("Il mio valore è " +valore);
        
        int q=10;
        String parola=Integer.toString(q);
        
        System.out.println("Come parola valgo "+parola);
        
        int w=5;
        int massimo=Integer.max(q, w);
        System.out.println("Il massimo tra q e w è "+massimo);
               
        
        int minimo=Integer.min(q,w);
        System.out.println("Il minimo tra q e w è "+minimo);
        
        
        //Il valore massimo del int
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
               
        final double PIGRECO=3.14;
        
        
        
        /*Simone e invio quando prende un nextline prende. L'invio è visto come
        una stringa*/
        //Per ricevere l invio è nextline nextint etc..+
                
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Inserisci il tuo nome:");
        //nextline - > ti genero una stringa
        String nome = sc.nextLine();//E' come se fosse l'invio.
        System.out.println("Ti chiami "+nome);
        
        System.out.println("Inserisci l'età:");
        int eta=sc.nextInt();//E' come se fosse l'invio.
        System.out.println("Hai " +eta+" anni");
        System.out.println("Colore preferito:");
        String colore=sc.nextLine();//E' come se fosse l'invio.
        
        
                
        
        
        
        
        
        
    }
    
}
