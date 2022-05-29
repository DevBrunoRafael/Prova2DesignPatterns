package Builder;

public class iphone11Builder extends SmartphoneBuilder{
    @Override
    public void buildNome() {
        smartphone.nome = "Iphone 11";
    }
    @Override
    public void buildPreco() {
        smartphone.preco = 3464;
    }
    @Override
    public void buildTela() {
        smartphone.tela = "LCD 6.1";
    }
    @Override
    public void buildMemoria() {
        smartphone.memoria = 512;
    }
    @Override
    public void buildCamera() {
        smartphone.camera = 24;
    }
    @Override
    public void buildProcessador() {
        smartphone.processador = "Apple A13 Bionic";
    }
}
