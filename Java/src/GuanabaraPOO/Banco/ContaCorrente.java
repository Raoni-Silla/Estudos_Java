package GuanabaraPOO.Banco;

public class ContaCorrente {

    private Owner owner;
    final String idAccount;
    String type;
    boolean status;

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
}
