/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj01_ripasso;

/**
 *
 * @author B22-233-2023
 */
public class Prj01_Ripasso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tipi di dato intero
        
        byte b; // -127 +128 = 256 cioè 2^8
        b=12;
        
        System.out.println("La variabile vale "+b);
        
        short s; 
        s=124;//signed: da -32768 a 32767
        System.out.println("La variabile vale "+s);
        
        int i;//signed: da -2147483648 a 2147483647 unsigned: da 0 a 4294967295
        i=1000;
        System.out.println("La variabile vale "+i);
        
        long l;
        l=12L; //cast implicito;
        System.out.println(l);
        i=(int)l;//cast esplicito;
        System.out.println(i);
        
        //l'intero mascherato
        //THE CHAR!!!!!!!!!!!
        
        char carattere=65;
        System.out.println(carattere);
        
        char lettera='a';
        
        
        int numero=65;
        
        carattere=(char)numero;
        System.out.println(carattere);
        
        
        //I tipi decimali
        
        float f=3.14F;//dobbiamo aggiungere la F 
        
        double d=5.99;
        
        d=f;
        /*testando i cast*/
        
        f=(float)d;
        
        numero=(int)d;
        
        //Booleani
        
        //usati quando ho solo due scelte da fare
        
        boolean vero=true;
        boolean falso=false;
        
        vero=falso;
        
        System.out.println(vero);
        
        vero=!vero;// Il punto esclamativo è l'operatore not che serve per invertire lo stato di un boolean
        
        int x=10;
        int y=20;
        x=y;
        
        
        //String 
        
        String stringa="ciao";
        System.out.println(stringa);
        
        //creazione di un oggetto 
        String parola= new String ("ciao");
        System.out.println(parola);
        
        System.out.println(parola.toUpperCase());
        //Le stringhe hanno un fottio e mezzo di metodi
        
        System.out.println(x==y);//dirà vero o falso poiché fa le comparazioni
        
        System.out.println(stringa==parola);//controlla le stringhe e da un errore
        //versione giusta è con equals
        System.out.println(parola.equals(stringa));
        //altro round di equals è equalsIgnoreCase (non controlla se è maiuscolo o minuscolo)
        System.out.println(parola.equalsIgnoreCase(stringa));
        
    }
    
}
