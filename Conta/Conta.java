package ProjetoBanco.Conta;

public abstract class Conta {
    //atributos básicos
    String nome;
    int nConta;
    double saldo;
    //metodos
    //contrutor default(vazio)
    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Saque(double valorSaque){
        System.out.println("O valor sacado será de: R$ "+valorSaque);
        saldo -= valorSaque;
    }

    public void Deposito(double valorDeposito){
        System.out.println("O valor depositado será de: R$ "+valorDeposito);
        saldo +=valorDeposito;
    }

    public void Empréstimo(double valorEmprestimo){
        if(valorEmprestimo > 10000 && valorEmprestimo < 20000){
            System.out.println("O banco não pode fazer um emprestimo tão alto");
        } else {System.out.println("O valor do emprestimo será de: R$ "+valorEmprestimo);
        saldo +=valorEmprestimo;
    }
    }
    
}

