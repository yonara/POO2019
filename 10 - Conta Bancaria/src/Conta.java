import java.util.ArrayList;

public class Conta {
    private int nextOp;
    private float saldo;
    private int numero;
    ArrayList<Operacao> extrato = new ArrayList<>();

    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0;
        this.nextOp = 0;
    }
    public Conta(){

    }

    public int getNextOp() {
        return nextOp;
    }

    public void setNextOp(int nextOp) {
        this.nextOp = nextOp;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void pushOperation(String descricao, float valor, float saldo){
        Operacao op = new Operacao(this.nextOp, descricao, valor, saldo);
        extrato.add(op);
    }

    public void tarifar(){
        this.setSaldo(this.getSaldo() - 5);
        pushOperation("tarifa", -5, this.getSaldo());
        this.nextOp++;
    }

    public void extornar(){
        this.setSaldo(this.getSaldo() + 5);
        pushOperation("extorno", 5, this.getSaldo());
        this.nextOp++;
    }

    public void sacar(float valor){
        if(this.getSaldo() > valor){
            this.setSaldo(this.getSaldo() - valor);
            pushOperation("saque", -valor, this.getSaldo());
            this.nextOp++;
            tarifar();
        }
        else{
            System.out.println("Saldo Insuficiente!");
        }

    }

    public void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
        pushOperation("deposito", valor, this.getSaldo());
        this.nextOp++;
        tarifar();
    }

    public void extorno(int id){
        boolean extorno = false;
        for(Operacao op : extrato){
            if(op.getIndice() == id && op.getDescricao().equals("tarifa")){
                extorno = true;
                break;
            }
        }
        if(extorno){
            extornar();
        }
        else{
            System.out.println("Indice inválido ou nao e tarifa");
        }
    }

    public void retornaExtrato(){
        for(Operacao op : extrato){
            System.out.println(op);
        }
    }
}
