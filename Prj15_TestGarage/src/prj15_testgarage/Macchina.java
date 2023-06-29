/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj15_testgarage;

/**
 *
 * @author b22-233-2023
 */
public class Macchina {
    
    private String nome;

    public Macchina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Macchina{" + "nome=" + nome + '}';
    }

    
    
    
    
    
}
