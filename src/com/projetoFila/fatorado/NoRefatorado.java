package com.projetoFila.fatorado;

public class NoRefatorado<T> {
    private T object;
    private NoRefatorado<T> refNo;

    public NoRefatorado(T object) {
        this.object = object;
        this.refNo = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoRefatorado<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(NoRefatorado<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                ", refNo=" + refNo +
                '}';
    }
}
