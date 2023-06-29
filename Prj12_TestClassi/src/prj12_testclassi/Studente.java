/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj12_testclassi;

/**
 *
 * @author B22-233-2023
 */
public class Studente {
    
    
    private String nome;
    private String cognome;
    private int matricola;
    
    private int voto1;
    private int voto2;
    private int voto3;

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getVoto1() {
        return voto1;
    }

    public void setVoto1(int voto1) {
        this.voto1 = voto1;
    }

    public int getVoto2() {
        return voto2;
    }

    public void setVoto2(int voto2) {
        this.voto2 = voto2;
    }

    public int getVoto3() {
        return voto3;
    }

    public void setVoto3(int voto3) {
        this.voto3 = voto3;
    }
    
    
    public double mediaVoti(){
        //cast da int a double
       return (double)(voto1+voto2+voto3/3);
    }

    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", voto1=" + voto1 + ", voto2=" + voto2 + ", voto3=" + voto3 + '}';
    }
    
    
    
    
    
}
