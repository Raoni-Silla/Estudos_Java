package GuanabaraPOO.EncapsulamentoeAbstracao.UFC;

public interface LutadorInterface {
    // apresenta o lutador
     void apresentar ();

    //dados menores do lutador
     void status ();

    //oque um lutador pode fazer na luta:
     void ganharLuta ();
     void perderLuta ();
     void empatarLuta ();
}
