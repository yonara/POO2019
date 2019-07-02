public class Operacao {
    private int indice;
    private String descricao;
    private float valor;
    private float saldo;

    public Operacao(int indice, String descricao, float valor, float saldo){
        this.indice = indice;
        this.descricao = descricao;
        this.valor = valor;
        this.saldo = saldo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return this.getIndice() + ": " + this.getDescricao() + ": " + this.getValor() + ": " + this.getSaldo();
    }
}