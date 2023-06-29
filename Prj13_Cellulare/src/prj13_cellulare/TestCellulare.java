/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj13_cellulare;

/**
 *
 * @author b22-233-2023
 */
public class TestCellulare {
     public static void main(String[] args) {
        // TODO code application logic here
        
        Prj13_Cellulare nokia= new Prj13_Cellulare ("Nokia","3310",20.0);
        
         System.out.println(nokia);//toString
         
         nokia.ricarica(50.0);
         
         System.out.println(nokia.getCredito());
         
         nokia.chiamata(13.0);
     
         System.out.println(nokia);
     
     
     
     }
     
     
}
