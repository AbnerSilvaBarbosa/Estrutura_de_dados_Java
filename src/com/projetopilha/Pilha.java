package com.projetopilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void pushNo(No novoNo){
        No refauxilar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refauxilar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoded = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoded;
        }

        return null;
    }
    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return this.refNoEntradaPilha == null ? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
