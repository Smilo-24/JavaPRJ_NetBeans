

package prj04_piove;

import java.util.Scanner;


public class Prj04_Piove {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //dichiaro
        int voto=9;
        if (voto>=6){
            System.out.println("promosso");
        }else{
            System.out.println("bocciato");
        }
        
        
        
        //OPERATORE TERNARIO
        
        
        /*
        1:condizione
        2:cosa devo fare se vero -> PUNTO DI DOMANDA
        3:cosa devo fare se falso -> DUE PUNTI
        */
        
        
        System.out.println("voto>=6?\"promosso\":\"bocciato\";");
        
        
        /********************************************************/
        
        
        int a=10;
        int b=20;
               
        int max;
        /*      
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        */
         //operatore ternario su questa operazione
        
        
        max=(a>b)?a:b;
        
        //nuovo esempio
        
        if(a>b){
            max=a;
        }else if(a==b){
            max=0;
        }else{
            max=b;
        }
        
        //:(a==b) è l'else if
        max=(a>b)?a:(a==b)?0:b;
       
        
        //////////////////////////////////////////////////////////////
        
        /* the switch*/
        
        int i=3;
        
        if(i==0) {
            System.out.println("i==0");
        }else if (i==1){
            System.out.println("i==1");
        }else if (i==2){
            System.out.println("i==2");
        }else{
            System.out.println("i è diverso da 0,1,2");
               
        
        //con lo switch semplifico questo blocco di codice dicendo che : 
        switch (i){
            case 0://IF
                System.out.println("i==0");
                break;
            case 1 ://ELSE IF
                System.out.println("i==1");
            case 2://ELSE IF
                System.out.println("i==2");
                defalut: //ELSE
                System.out.println("i e' diverso da 0,1,2");
        }
        
        //Posso scrivere cosi anche lo swtich
        String lettera="1";
        String messaggio;
        
        switch(lettera){
            case "a"://if
            case "e"://else if
            case "i"://else if
            case "o"://else if
            case "u"://else if
            messaggio="vocale";
            break;
            default: //else
                messaggio="consonante";
        }
        
            System.out.println(messaggio);
        

        /*semplificare ulteriormente lo switch*/
        
        switch(lettera){
            case "a","e","i","o","u" -> messaggio="vocale";
            default -> messaggio="consonante";
        }
        
        /*dato un mese restituire il numero di giorni*/
        //febbraio 28
        //novembre 30
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserisci il mese");
        
        

        String mese = sc.nextLine();

        String giorni;

        switch (mese) {
            case "gennaio":
            case "marzo":
            case "maggio":
            case "luglio":
            case "agosto":
            case "ottobre":
            case "dicembre":
                giorni = "31";
                break;
            case "aprile":
            case "giugno":
            case "settembre":
            case "novembre":
                giorni = "30";
                break;
            case "febbraio":
                giorni = "28";
                break;
            default:
                giorni = "Mese non valido";
                break;
        }

        System.out.println("Il numero di giorni nel mese di " + mese + " e' " + giorni);
            
               
       }
        
     }
   }

