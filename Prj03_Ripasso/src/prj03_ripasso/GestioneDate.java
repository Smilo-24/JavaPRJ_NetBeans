/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj03_ripasso;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author B22-233-2023
 */
public class GestioneDate {

    public static void main(String[] args) {

        // classi statiche non usano il new ma usano get istance
        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("'Oggi e' il : dd/MM/yyyy HH:mm:ss'");
        System.out.println(sdf.format(c.getTime()));

        //Ora locale       
        System.out.println(c.getTime());

        System.out.println("Mese: " + c.get(Calendar.MONTH));
        System.out.println("Giorno: " + c.get(Calendar.DATE));
        System.out.println("Anno: " + c.get(Calendar.YEAR));

        //Formattazione dei numeri
        double d = 3.141519565555;
        //Formattare un numero
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(d));

        Random r = new Random();
        int numero = r.nextInt(101);//gli estremi superiori

        System.out.println(numero);

        double virgola = r.nextDouble(50, 101);
        System.out.println(df.format(virgola));

        ////////////////////////////
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci l'eta' ");

        // l'età che raccolgo la metto in una variabile
        int eta = sc.nextInt();

        if (eta >= 18) {//ramo condizione VERA
            System.out.println("Sei maggiorenne puoi entrare ");
        } else if (eta == 18) {
            System.out.println("Hai proprio 18 anni");
        } else {//ramo falso
            System.out.println("Non puoi entrare");
        }

        boolean sole = false;
        double temp = 22;

        if (sole || temp > 20) {
            System.out.println("Esco");
        } else {
            System.out.println("Sto a casa");
        }

        int voto1 = 5;
        int voto2 = 5;
        int voto3 = 9;
        /*
        if(voto1>=6 && voto2>=6 || voto 3>=6){
           System.out.println("Promosso");
        }else{
                System.out.println("Bocciato");
                }
        
         */

    }

}
