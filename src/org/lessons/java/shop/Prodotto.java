package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    //Caratteristiche del prodotto
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    double iva;


    //Metodi
    public Prodotto(String nome, String descrizione, double prezzo, double iva){
        Random rand = new Random();
        this.codice = rand.nextInt(777777);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double prezzoBase(){
        return this.prezzo;
    }

    public double prezzoIva(){
        return this.prezzo + this.prezzo * this.iva;
    }

    public String nomeCompleto(){
        return this.codice + "-" + this.nome;
    }
}
