package GuanabaraPOO.UEC;

public interface LutadorInterface {
    // apresenta o lutador
    public void apresentar ();

    //dados menores do lutador
    public void status ();

    //oque um lutador pode fazer na luta:
    public void ganharLuta ();
    public void perderLuta ();
    public void empatarLuta ();
}
