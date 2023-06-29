package prj07_metodi;

public class Prj07_Metodi {

    public static void main(String[] args) {
        // TODO code application logic here

        stampa();
        stampaConParametriIngresso("mario", "rossi");
        String risultato = StampaConParametriOutput("Max", "Pezzali");
        System.out.println(risultato);

        //PARAMETRI ATTUALI
        System.out.println(StampaConParametriOutput("Piero", "Pelù"));

        int ris = somma(1, 2);
        System.out.println(ris);

        String risString = somma1("ciao", "miao", "bau");
        System.out.println(risString);

        String[] animali = {"cane", "gatto", "pesce", "tricheco"};
        leggiArray(animali);
    }

    static String[] creaArray(String uno, String due, String tre) {
        String[] giorgio = {uno, due, tre};
        return giorgio;
    }

    //metodo che prende in input un array e stampa i valori
    static void leggiArray(String[] arr) {
        for (String valori : arr) {
            System.out.println(valori);
        }
    }

    //esercizio
    static boolean isDivisibile(int num1, int num2) {
        return (num1 % num2 == 0);//op. modulo
    }

    static int varArgs(int... x) {
        //considerare x come se fosse un array
        int tot = 0;
        System.out.println("hai passato questi valori");
        for (int i : x) {
            System.out.println(i);
            tot += i;
        }
        return tot;
    }

    static String somma1(String a, String b, String c) {
        return a + b;
    }

    static int somma(String a, String b) {
        int valore1 = Integer.parseInt(a);
        int valore2 = Integer.parseInt(b);
        return valore1 + valore2;
    }

    //overload stsso nome ma diverso numero/o tipo di parametri
    static int somma(int a, int b) {
        return a + b;
    }

//richiamare un metodo fuori dal main
    static void stampa() {
        System.out.println("ciao");
    }

    //passo i parametri nelle tonde.b 
    static void stampaConParametriIngresso(String valore, String valore2) { //parametri formali
        System.out.println("Il mio nome e' " + valore + " il mio cognome e' " + valore2);
    }

    static String StampaConParametriOutput(String valore, String valore2) {
        return "il mio nome e' " + valore + " il mio cognome e' " + valore2;
    }

}
