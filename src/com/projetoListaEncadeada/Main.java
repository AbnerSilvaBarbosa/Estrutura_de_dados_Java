package com.projetoListaEncadeada;

public class Main {
    public static void main(String[] args){
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        System.out.println(listaEncadeada.size());
        listaEncadeada.add(1);
        System.out.println(listaEncadeada.size());
        listaEncadeada.add(2);
        System.out.println(listaEncadeada.size());
        listaEncadeada.add(3);
        System.out.println(listaEncadeada.size());

        System.out.println(listaEncadeada.toString());

        System.out.println(listaEncadeada.get(2));

//        System.out.println(listaEncadeada.get(3));

//        listaEncadeada.remove(2);
//        System.out.println(listaEncadeada.toString());
//
//        System.out.println(listaEncadeada.get(2));

    }
}
