

package prj14_testfrigo;

import java.util.ArrayList;
import java.util.Arrays;


public class Prj14_TestFrigo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cibo[]arrCibi =  new Cibo[3];
        
        Cibo pizza = new Cibo("pizza",2.0);
        
        Cibo hamburger = new Cibo ("Hamburger",1.1);
        
        Cibo gelato = new Cibo ("Gelato",3.20);
        
        
        arrCibi[0]=pizza;
        arrCibi[1]=hamburger;
        arrCibi[2]=gelato;
        
        System.out.println("Nel frigo ci sono questi cibi");
        
        for (Cibo cibo : arrCibi) {
            System.out.println(cibo);
        }
        
        //oggetto anonimo, paso dal costruttore
        
        Cibo[] dispensa = {new Cibo("Pasta",0.40),new Cibo("Pollo",3.30),new Cibo("Insalata",1.10)};
        for (Cibo cibo : dispensa) {
            System.out.println(cibo);
        }
 
        
        /////////////////////////////////////////////////////////
        
        /*Trasformare un array in un arrayList*/
        ArrayList<Cibo> lista =  new ArrayList(Arrays.asList(dispensa));
        lista.add(new Cibo("Formaggio",6.60));
        
        //for each applicato all arraylist
        //callback function
        lista.forEach(cibo->System.out.println(cibo));
        
        lista.forEach(System.out::println);
    }

}
