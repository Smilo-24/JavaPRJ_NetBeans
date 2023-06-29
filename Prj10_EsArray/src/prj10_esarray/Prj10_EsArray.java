

package prj10_esarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Prj10_EsArray {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Inserisci la lunghezza dell'array");
        
        Scanner s= new Scanner(System.in);
        
        int lung= s.nextInt();
        //buona prassi passare il nextline
        s.nextLine();
        int [] arr =  new int [lung];
        int i = 0;
        while(true){
            System.out.println("Inserisci un numero, 0 per uscire");
        
            String val = s.nextLine();
            
            if (val.equalsIgnoreCase("fine")){
                break;
            }
            
            try{
                arr[i]=Integer.parseInt(val);
                i++;//incremento l'indice
                System.out.println(Arrays.toString(arr));
            }catch(NumberFormatException e){
                System.out.println("Non è un numero");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Hai superato i limiti dell'array");
            arr= new int[lung];//azzeriamo l'array
            i=0;
            }catch(Exception e){
                System.out.println("Errore generico" +e.getMessage());
            }
        
            System.out.println(Arrays.toString(arr));
        }
        
        
        
        
    }

}
