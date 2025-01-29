package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto libro = new Prodotto("Harry Potter", "Libro", 16.33, 2.23);

        System.out.println("Il prezzo del libro è:" + libro.prezzoBase());
        System.out.println("Il prezzo del libro + iva è:" +libro.prezzoIva());
        System.out.println("Il nome del libro, con codice, è:" +libro.nomeCompleto());
    }
}
