package teste;

class Conta {
    private int numero;
    private int saldo;

    Conta(int numero, int saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}