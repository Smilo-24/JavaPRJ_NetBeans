package prj05_cicli;

import java.util.Random;

public class Prj05_Cicli {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("***********************");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("***********************");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Stampo numeri pari
        System.out.println("***********************");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        //tabella ascii
        System.out.println("***********************");
        for (int i = 0; i < 256; i++) {
            System.out.println((char) i);
        }
        System.out.println("***********************");
        int contatore = 0;//1
        for (; contatore < 10;) {//2
            System.out.println(contatore);
            contatore++;//3
        }

        System.out.println("***********************");
        for (int i = 0, j = 10; i < 10; i++, j--) {
            System.out.println(i + "" + j);
        }
        System.out.println("***********************");

        String a = " Ciao a tutti ";

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));//caratteere alla posizione I
        }
        System.out.println("***********************");

        String frase = "Ciao a tutti oggi piove";
        int numeroSpazi = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                numeroSpazi++;

            }
        }

        System.out.println("ci sono " + numeroSpazi + " spazi");

        System.out.println("***********************");

        Random r = new Random();
        int casuale = r.nextInt(1, 21);//1--20
        //Per evitare di dire infinite volte trovato dichiaro una variabile booleana
        boolean trovato = false;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == casuale) {
                trovato = true;
                break;
                // System.out.println("trovato");
            }//else{
            //System.out.println("non trovato");

            //}
        }
        //usare l operatore ternario
        //Controllo dello stato a fine codice
        /*String siNo=trovato?"il numero è stato trovato":"non e' stato trovato";*/
        //System.out.println(siNo);    
        
        
        //CICLI ANNIDATI
        
        for (int i = 0; i < 10; i++) {//per ogni ciclo di questo
            for (int j = 0; j < 10; j++) {//stampo tutti i valori
                System.out.print("\t"+i*j);
            }
            System.out.println("");//vado a capo dopo il ciclo esterno
        }
    }
}
