/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj12_testclassi;

/**
 *
 * @author B22-233-2023
 */
public class Gatto {

    private String nome, razza;
    private int eta;

    /**
     * Costruttore con 3 parametri in ingresso.
     *
     * @param nome String
     * @param razza String
     * @param eta int
     */
    public Gatto(String nome, String razza, int eta) {
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
    }

    /**
     *
     */
    public void miagola() {

        System.out.println("Miao miao");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    //il to string deriva da object
    @Override
    public String toString() {
        return "Gatto{" + "nome=" + nome + ", razza=" + razza + ", eta=" + eta + '}';
    }
    
    

}
