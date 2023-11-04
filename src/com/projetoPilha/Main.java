package com.projetoPilha;

public class Main {

    public static void main(String[] args){
        No no1 = new No(1);
        No no2 = new No(2);

        Pilha pilha = new Pilha();
        pilha.pushNo(no1);
        pilha.pushNo(no2);
        System.out.println(pilha.top());
    }
}
