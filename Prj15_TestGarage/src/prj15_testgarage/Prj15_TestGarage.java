package prj15_testgarage;

import java.util.ArrayList;
import java.util.Scanner;

public class Prj15_TestGarage {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Quanti posti ha il parcheggio");

        Scanner s = new Scanner(System.in);

        int posti = s.nextInt();//posti del parcheggio

        s.nextLine();//pulire lo scanner
        //costruisco il garage che si chiamerà "Garage1"
        Garage garage1 = new Garage("Garage1");
        //parcheggio le auto
        for (int i = 0; i < posti; i++) {
            System.out.println("Che auto vuoi parcheggiare?");
            //Macchine anonime
            garage1.parcheggia(new Macchina(s.nextLine()));
        }
        System.out.println("Il parcheggio ha questi veicoli");
        garage1.elenco();
        /*************************************/
        ArrayList<Macchina> veicoli = new ArrayList();
        for (int i = 0; i < posti; i++) {
            System.out.println("Che macchina vuoi parcheggiare?");
            veicoli.add(new Macchina(s.nextLine()));
        }
        //metodo che parcheggia un elenco di veicoli
        garage1.parcheggiaTutti(veicoli);
        //per vedere la differenza dei veicoli parcheggiati sopra e sotto
        System.out.println("Il parcheggio ha questi veicoli");
        garage1.elenco();
    }

}

