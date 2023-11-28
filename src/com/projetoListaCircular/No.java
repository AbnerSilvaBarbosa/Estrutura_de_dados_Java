package com.projetoListaCircular;

public class No<T> {

    private No<T> noProximo;
    private T conteudo;

    public No( T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return noProximo;
    }

    public void setProximoNo(No refNo) {
        noProximo = refNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
