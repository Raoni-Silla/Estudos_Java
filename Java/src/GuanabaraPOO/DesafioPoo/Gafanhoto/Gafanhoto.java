package GuanabaraPOO.DesafioPoo.Gafanhoto;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;


    Gafanhoto(String login) {
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
}
