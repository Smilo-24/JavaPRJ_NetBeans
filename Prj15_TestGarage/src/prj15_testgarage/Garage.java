/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj15_testgarage;

import java.util.ArrayList;

/**
 *yes its smilo
 * @author b22-233-2023
 */
public class Garage {
    
    
    private String nome;
    
    //elenco di macchine nel garage
    private ArrayList<Macchina> macchine = new ArrayList ();

    public Garage(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Metodo che parcheggia un veicolo
     * @param veicolo una macchina da inserire in arrayList
     */
    //metodo parcheggia : prende una macchina e lo mette nel garage
    //Macchina è il tipo di dato nella classe e veicolo è il nome del parametro
    public void parcheggia(Macchina veicolo){//prende veicolo e lo mette in arrayList
    macchine.add(veicolo);     
    }
    /**
     * Metodo che parcheggia un insieme di veicoli
     * @param veicoli arrayList di veicoli da parcheggiare
     */
    public void parcheggiaTutti(ArrayList<Macchina> veicoli){
        for (Macchina macchina : veicoli) {
            macchine.add(macchina);
        }
    }
    
    public void elenco(){
        macchine.forEach(System.out::println);
    }
    
}
