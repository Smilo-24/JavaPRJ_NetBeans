/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj14_testfrigo;

/**
 *
 * @author b22-233-2023
 */
public class Cibo {
    
    private String nome;
    private double prezzo;
    
    
    
    public Cibo(String nome, double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cibo{" + "nome=" + nome + ", prezzo=" + prezzo + '}';
    }

    
    
}
