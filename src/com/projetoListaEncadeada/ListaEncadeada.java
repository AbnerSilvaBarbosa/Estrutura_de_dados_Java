package com.projetoListaEncadeada;

public class ListaEncadeada<T> {

    private No referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null? true:false;
    }

    public int size(){
        if(!this.isEmpty()){
            No<T> referecniaAux = referenciaEntrada;
            int count = 0;
            while (true){
                if(referecniaAux != null){
                    count += 1;
                    referecniaAux = referecniaAux.getProximoNo();
                }else {
                    break;
                }
            }

            return count;
        }

        return 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        if(index > this.size()){
            throw new IndexOutOfBoundsException("Não existe esse index");
        }

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);

        if(index == 0 ){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
