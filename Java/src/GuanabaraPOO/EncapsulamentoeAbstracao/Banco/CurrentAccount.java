package GuanabaraPOO.EncapsulamentoeAbstracao.Banco;

public class CurrentAccount {


    private static int contadorDeContas = 1;

    private Owner owner;
    private int idAccount;
    private double saldo;
    private String type;
    private boolean status;


    CurrentAccount(Owner owner, String type) {
        this.setOwner(owner);
        this.setType(type);
        this.saldo = 0;
        this.status = false;

       //Lógica de ID simplificada usando o contador estático.
        this.idAccount = contadorDeContas;
        contadorDeContas++;
    }



    public void openAccount() {
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso! ID: " + this.getIdAccount());
    }

    public void closeAccount() {
        if (this.saldo > 0) {
            System.out.println("Erro: A conta possui saldo. Saque o valor antes de fechar.");
        } else if (this.saldo < 0) {
            System.out.println("Erro: A conta possui débitos pendentes.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(double value) {
        if (!this.isStatus()) {
            System.out.println("Impossível depositar: a conta está fechada.");
            return;
        }

        if (value <= 0) {
            System.out.println("Valor de depósito inválido (deve ser maior que zero).");
        } else {
            this.saldo += value;
            System.out.println("Depósito de R$" + value + " realizado. Novo saldo: R$" + this.getSaldo());
        }
    }

    public void sacar(double value) {
        if (!this.isStatus()) {
            System.out.println("Impossível sacar: a conta está fechada.");
            return;
        }


        if (this.getSaldo() >= value) {
            this.saldo -= value;
            System.out.println("Saque de R$" + value + " realizado. Novo saldo: R$" + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }




    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }


    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}