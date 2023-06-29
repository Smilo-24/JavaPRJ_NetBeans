

package prj16_testpackage;
//importo la classe
import package2.Classe11;

//import il package persona

import prj11_persona.Persona;




public class Prj16_TestPackage {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Classe1 c= new Classe1(10,20);
        System.out.println(c);//toString
        Classe11 c2= new Classe11("a", "b");
        System.out.println(c2);
        c2.d="d";
        
        
        Persona p = new Persona("Piero","Pelù",30);
        
    }

}
