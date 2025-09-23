package GuanabaraPOO.Banco;

public class ContaCorrente {

    private Owner owner;
    final private String idAccount;
    private double saldo;
    public String type;
    private boolean status;

    ContaCorrente (Owner owner, String idAccount, String type, Owner owner1){
        setOwner(owner);
        setType(type);
        this.idAccount = idAccount;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = new Owner(owner.name, owner.age);
    }

    public String getIdAccount() {
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
            }
        }else System.out.println("conta desativada");
    }
}
