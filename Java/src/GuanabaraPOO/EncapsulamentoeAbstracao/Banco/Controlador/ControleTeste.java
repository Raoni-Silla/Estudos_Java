package GuanabaraPOO.EncapsulamentoeAbstracao.Banco.Controlador;

public class ControleTeste {
    public static void main(String[] args) {

        ControleRemoto samsung = new ControleRemoto();

        samsung.ligar();

        samsung.maisVolume();
        samsung.abrirMenu();
        samsung.fecharMenu();
        samsung.maisVolume();
        samsung.abrirMenu();
        samsung.fecharMenu();
        samsung.menosVolume();
        samsung.abrirMenu();
        samsung.fecharMenu();
        samsung.ligarMudo();
        samsung.abrirMenu();
        samsung.fecharMenu();
        samsung.desligarMudo();
        samsung.abrirMenu();
        samsung.fecharMenu();

    }
}
