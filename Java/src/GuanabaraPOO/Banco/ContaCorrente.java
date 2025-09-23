package GuanabaraPOO.Banco;

import java.util.ArrayList;

public class ContaCorrente {

    private Owner owner;
    private int idAccount = 1;
    private double saldo;
    public String type;
    private boolean status;
    private ArrayList <Integer> ids = new ArrayList<>();

    ContaCorrente (Owner owner, String type){
        setOwner(owner);
        setType(type);
        ids.add(idAccount);
        this.idAccount = calcId ();
    }

    private int calcId() {
        int lastId = ids.getLast();
        return this.idAccount + lastId;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = new Owner(owner.name, owner.age);
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        if (saldo < 0){
            System.out.println("saldo invalido");
        }else this.saldo = saldo;

    }


    public void openAccount (){
        this.status = true;
        System.out.println("Conta aberta, no nome de "+ getOwner().getName());
    }

    public void closeAccount (){

        this.status = false;
        System.out.println("Conta fechada..");

    }

    public void depositar (double value){
        if (this.status == true) {
            if (value <= 0) {
                System.out.println("impossivel depositar");
                System.out.println("valor negativo ou nulo");

            }else {
                double total = this.getSaldo();
                total += value;
                this.saldo = value;
            }
        }else System.out.println("conta desativada");
    }

    public double sacarDh (double value){

        if (this.status == true) {

            if (saldo > 0) {

                return this.saldo - value;

            }else System.out.println("sem saldo para saque");

        }else System.out.println("conta fechada");

        return 0;
    }
}
