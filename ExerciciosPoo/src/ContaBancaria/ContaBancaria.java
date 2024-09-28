package ContaBancaria;

public class ContaBancaria {
    private int numeroDaConta;
    private String titular;
    private int Saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }
    public void depositar(){
        System.out.println("depositar o dinheiro");
    }
    public void consultar(){
        System.out.println("consultar saldo");
    }
    public void sacar(){
        System.out.println("sacar dinheiro");
    }
}
