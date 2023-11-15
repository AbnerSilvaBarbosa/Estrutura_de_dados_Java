package com.projetoListaEncadeadaDupla;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return tamanhoLista;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> auxiliar = primeiroNo;

        for (int i = 0; (i < index) && (auxiliar != null); i++) {
            auxiliar = auxiliar.getNoProximo();
        }

        return auxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }
}
