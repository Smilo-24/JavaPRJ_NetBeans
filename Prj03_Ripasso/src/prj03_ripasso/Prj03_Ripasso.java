

package prj03_ripasso;

import java.util.Scanner;


public class Prj03_Ripasso {

   
         public static void main(String[] args) {
        // TODO code application logic here
        
        int x=10;
        int y=20;
        
        System.out.println("x = "+x+" y = "+y);
        
        
        // per fare lo swap delle variabil
        //ordinare dei numeri confrontando il numero dopo 
        int tempo;
        tempo=x;
        x=y;
        y=tempo;
        System.out.println("x = "+x+" y = "+y);
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome");
        
        String nome = sc.nextLine();
       
        System.out.println("eta");
        
        int eta=sc.nextInt();
        System.out.println("colore");
        sc.nextLine(); //per pulire lo scanner dall invio
        String colore=sc.nextLine();
        
        
       
        
    }

}
