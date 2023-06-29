/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj12_testclassi;

import java.util.Objects;

/**
 *
 * @author B22-233-2023
 */
public class Macchina {
    
    private String marca;
    private String modello;
    private double prezzo;
    private int km;

    //gemerato automaticamente
    public Macchina(String marca, String modello, double prezzo, int km) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.km = km;
    }
    
    
    public void guida(int km){
        System.out.println("Sto guidando per "+km+" km");
    }
    
    public void frena(){
        System.out.println("Sto frenando");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Macchina other = (Macchina) obj;
        //se non è uguale ritorna falso (!Obj)
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modello, other.modello);
    }

    
    @Override
    public String toString() {
        return "Macchina{" + "marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + ", km=" + km + '}';
    }
    
    
    
    
}
