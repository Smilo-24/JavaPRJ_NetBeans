package prj09_rubrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Prj09_Rubrica {

    //Variabile globale
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> nomi = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here

       

        while (true) {
            System.out.println("Scegli una opzione: ");
            System.out.println("1 Inserisci un nome ");
            System.out.println("2 Cancella un nome ");
            System.out.println("3 Cerca un nome ");
            System.out.println("4 Scegli una opzione: ");
            System.out.println("5 Esci ");

            int scelta = sc.nextInt();

            sc.nextLine();//
            
            switch (scelta) {
                case 1:
                    inserisciNome();
                    break;
                case 2:
                    cancellaNome();
                    break;
                case 3:
                    cercaNome();
                    break;
                case 4:
                    visualizza();
                    break;
                case 5:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Non e' una scelta valida");
            }//Fine dello Swtich

        }//Fine del While

    }//Fiune del main

    //I metodi si inseriscono fuori dal main
    static void inserisciNome() {
        System.out.println("Inserisci il nome");
        String nome = sc.nextLine();
        nomi.add(nome);
        System.out.println("Hai inserito" + nome);

    }

    static void cancellaNome() {
        System.out.println("Inserisci il nome da cancellare");
        String nome = sc.nextLine();
        if (nomi.contains(nome)) {
            nomi.remove(nome);
            System.out.println("Hai eliminato " + nome);
        } else {
            System.out.println("Il nome che vuoi eliminare non esiste");
        }
    }

    static void cercaNome() {
        System.out.println("Inserisci il nome da cercare");
        String nome = sc.nextLine();
        if (nomi.contains(nome)) {
            System.out.println("Il nome esiste");
        } else {
            System.out.println("Il nome non esiste");
        }
    }  

    static void visualizza() {
        //System.out.println(nomi);
        nomi.forEach(System.out::println); //Method reference
    }
}
