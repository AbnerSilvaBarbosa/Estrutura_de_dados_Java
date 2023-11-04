package com.projetoFila;

public class Fila {

    private No refNoFila;

    public Fila() {
        this.refNoFila = null;
    }

    public boolean isEmpty(){
        return refNoFila == null ? true:false;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoFila);
        refNoFila = novoNo;
    }

    public No dequeue(){
        if(!isEmpty()){
            No proximoNo = refNoFila;
            No auxiliarNo = refNoFila;
            while (true){
                if(proximoNo.getRefNo() != null){
                    auxiliarNo = proximoNo;
                    proximoNo = proximoNo.getRefNo();
                }else {
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }

            return proximoNo;
        }

        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoFila;

        if(refNoFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
