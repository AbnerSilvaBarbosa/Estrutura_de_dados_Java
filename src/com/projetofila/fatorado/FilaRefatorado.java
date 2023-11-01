package com.projetofila.fatorado;

public class FilaRefatorado<T> {
    private NoRefatorado<T> refNoFila;

    public FilaRefatorado() {
        this.refNoFila = null;
    }

    public boolean isEmpty(){
        return refNoFila == null ? true:false;
    }

    public void enqueue(T valueNo){
        NoRefatorado<T> novoNo = new NoRefatorado<T>(valueNo);
        novoNo.setRefNo(refNoFila);
        refNoFila = novoNo;
    }

    public Object dequeue(){
        if(!isEmpty()){
            NoRefatorado<T> proximoNo = refNoFila;
            NoRefatorado<T> auxiliarNo = refNoFila;
            while (true){
                if(proximoNo.getRefNo() != null){
                    auxiliarNo = proximoNo;
                    proximoNo = proximoNo.getRefNo();
                }else {
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }

            return proximoNo.getObject();
        }

        return null;
    }

    public Object first(){
        if(!this.isEmpty()){
            NoRefatorado<T> primeiroNo = refNoFila;
            while (true){
                if(primeiroNo.getObject() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }

            return primeiroNo.getObject();
        }

        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoRefatorado<T> noAuxiliar = refNoFila;

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
