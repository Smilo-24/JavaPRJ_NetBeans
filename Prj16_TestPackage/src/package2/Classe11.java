/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

/**
 *
 * @author b22-233-2023
 */
public class Classe11 {
    
    private String a;
    private String b;
    
    String c;//Visibilità di default, visibile solo all'interno del suo package

    //dichiaro una variabile pubblica
    //
    public String d;
    
    public Classe11(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Classe1{" + "a=" + a + ", b=" + b + '}';
    }
    
    
    
    
    
    
}
