package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    //Caratteristiche del prodotto
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    float iva;


    //Metodi
    public Prodotto(String nome, String descrizione, float prezzo, float iva){
        Random rand = new Random();
        this.codice = rand.nextInt(777777);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public float prezzoBase(){
        return this.prezzo;
    }

    public float prezzoIva(){
        return this.prezzo + this.prezzo * this.iva;
    }

    public String nomeCompleto(){
        return this.codice + "-" + this.nome;
    }
}
