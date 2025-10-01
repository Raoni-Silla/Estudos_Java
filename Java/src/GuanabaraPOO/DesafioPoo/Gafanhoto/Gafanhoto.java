package GuanabaraPOO.DesafioPoo.Gafanhoto;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;


    public Gafanhoto(String nome, String sexo, int idade, String login) {
        //o primeiro construtor a ser chamado é o construtor do metodo pai
        //para garantir que a parte pessoa de gafanhoto seja feita primeiro
        super(nome,idade,sexo);
        setLogin(login);
        setTotAssistido(0);
    }


    public void viuMaisUm() {
        setTotAssistido(getTotAssistido() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExp() {

    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                //super to string chama os dados
                ", User:'" + super.toString() + '\'' +
                '}';
    }
}
