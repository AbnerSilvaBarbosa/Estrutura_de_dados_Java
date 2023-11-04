package com.projetoFila;

public class Main {
    public static void main(String[] args){
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);

        Fila fila = new Fila();
        fila.enqueue(no1);
        fila.enqueue(no2);
        fila.enqueue(no3);
        System.out.println(fila.toString());

        fila.dequeue();
        System.out.println(fila.toString());
    }
}
