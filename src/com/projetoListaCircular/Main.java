package com.projetoListaCircular;

public class Main {
    public static void main(String args[]){
        ListaCircular<Integer> listaCircular = new ListaCircular<>();

        listaCircular.add(1);
        listaCircular.add(2);
        listaCircular.add(3);

        System.out.println(listaCircular.toString());

        System.out.println(listaCircular.get(0));

        listaCircular.remove(1);
        System.out.println(listaCircular.get(1));

        System.out.println(listaCircular.toString());
    }
}
