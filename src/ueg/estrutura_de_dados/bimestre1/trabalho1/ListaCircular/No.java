package ueg.estrutura_de_dados.bimestre1.trabalho1.ListaCircular;

class No{
    protected No prox; // ponteiro para pr�ximo n�
    protected int info; // valor do n� da lista

    /**
     * Construtor do pr�ximo n�
     *
     * @param prox
     * @param info
     */
    public No(No prox, int info){
        this.prox = prox;
        this.info = info;
    }

    /**
     * Construtor do n� atual
     *
     * @param info
     */
    public No(int info){
        this.info = info; // valor do n� da lista
        prox = null; // ponteiro para proximo n�
    }

    /**
     * Insere o endere�o do pr�ximo n�
     *
     * @param prox
     */
    public void setProx(No prox){ this.prox = prox; }
    public No getProx(){ return prox; }

    /**
     * Insere valor do pr�ximo n�
     *
     * @param info
     */
    public void setInfo(int info){ this.info = info; }
    public int getInfo(){ return info; }
}