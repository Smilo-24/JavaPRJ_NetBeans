/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj11_persona;

/**
 *
 * @author B22-233-2023
 */
public class Persona {

    //attributi che descrivono le caratteristiche della clsase
    //per incapsulare ho cambiato da public a private
    private String nome;
    private String cognome;
    private int eta;
    private boolean maggiorenne;
    private final int NUMERO_OCCHI = 2;

    /**
     * Questo metodo serve per assegnare il nome alla persona
     * @param nome parametro stringa che rappresenta il nome della persona
     */
    //get e set
    //set assegna il valore, get ritorno un valore
    public void setNome(String nome){
        this.nome=nome;
    }
    /**
     * Metodo per assegnare il cognome alla persona
     * @param cognome il cognome della persona
     */
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setEta(int eta){
        this.eta=eta;
    }
    
    public void setMaggiorenne(boolean maggiorenne){
        this.maggiorenne=maggiorenne;
    }
    
    //this è indifferente posso metterlo e non metterlo
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return cognome;
    }
    
    public int getEta(){
        return eta;
    }
    
    public boolean getMaggiorenne(){
        return maggiorenne;
    }
    
    
    ///////////////////////////////////////////////////////
    //Il costruttore è un metodo che NON RITORNA NIENTE, NEANCHE UN VOID
    //HA LO STESSO NOME DELLA CLASSE
    public Persona() {
    }

    ; 

    /**
     * 
     * @param nome nome della persona Stringa
     * @param cognome cognome della persona Stringa
     * @param eta eta della persona int 
     */
//Costruttore di default derivato dalla classe Object //che è la classe da cui derivano tutte le altre classi
    
    public Persona(String n, String c, int e) {//this si riferisce all attributo della classe
        nome = n;
        cognome = c;
        eta = e;
    }

    public Persona(String n, String c) {

    }

    //metodi rappresentano le funzionalità della classe
    //cosa la classe può fare
    /**
     * Metodo che fa mangiare la persona
     * @param cibo 
     */
    public void mangia(String cibo) {
        System.out.println("Sto mangiando" + cibo);
    }

    //per fare overload cambio parametri
    public void mangia(String pranzo, String cena) {
        System.out.println("A pranzo mangio " + pranzo + " a cena mangio");
    }

    public void dorme() {
        System.out.println("zzzzzzzzzz");
    }

    public boolean isMaggiorenne() {
        return eta >= 18;
    }

    /*
public void info(){
    System.out.println("La persona si chiama "+ nome + cognome+
            " ha "+ eta + " anni "+ " maggiorenne? "+ maggiorenne
    + " ha come tutti " + NUMERO_OCCHI + " occhi");
}
     */
    @Override
    public String toString() {
        return "La persona si chiama " + nome + cognome
                + " ha " + eta + " anni " + " maggiorenne? " + maggiorenne
                + " ha come tutti " + NUMERO_OCCHI + " occhi";
    }
    //ereditato da Object , è un boolean, prende come parametro un oggetto

    public boolean equals(Object o) {
        //faccio un cast dell oggetto o che diventa una persona
        //nome della classe = nome del oggetto in input

        return this.nome.equals(((Persona) (o)).nome)
                && this.cognome.equals(((Persona) (o)).cognome);

        /*Spiegazione:
        Ho un oggetto persona e confronto il nome dell oggetto */
    }

}
