package com.projetoListaEncadeadaDupla;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        listaDuplamenteEncadeada.add("A");
        listaDuplamenteEncadeada.add("B");

        System.out.println(listaDuplamenteEncadeada.toString());

        System.out.println("index 1: " + listaDuplamenteEncadeada.get(1));

        listaDuplamenteEncadeada.add(1,"C");
        System.out.println(listaDuplamenteEncadeada.toString());

        listaDuplamenteEncadeada.remove(1);
        System.out.println(listaDuplamenteEncadeada.toString());
    }
}
