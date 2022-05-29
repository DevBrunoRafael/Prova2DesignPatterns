package Builder;

public class pocoX3Builder extends SmartphoneBuilder{
    @Override
    public void buildNome() {
        smartphone.nome = "PocoX3";
    }
    @Override
    public void buildPreco() {
        smartphone.preco = 2390;
    }
    @Override
    public void buildTela() {
        smartphone.tela = "LCD 6.3";
    }
    @Override
    public void buildMemoria() {
        smartphone.memoria = 128;
    }
    @Override
    public void buildCamera() {
        smartphone.camera = 64;
    }
    @Override
    public void buildProcessador() {
        smartphone.processador = "Snapdragon 732G";
    }
}
