package com.projetopilha;

public class No {
    private int dado;
    private No refNo = null;

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No proximoNo) {
        this.refNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
