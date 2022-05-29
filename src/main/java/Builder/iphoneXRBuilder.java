package Builder;

public class iphoneXRBuilder extends SmartphoneBuilder {
	@Override
	public void buildNome() {
		smartphone.nome = "Iphone XR";
	}
	@Override
	public void buildPreco() {
		smartphone.preco = 2807;
	}
	@Override
	public void buildTela() {
		smartphone.tela = "IPS LCD 6.1";
	}
	@Override
	public void buildMemoria() {
		smartphone.memoria = 256;
	}
	@Override
	public void buildCamera() {
		smartphone.camera = 12;
	}
	@Override
	public void buildProcessador() {
		smartphone.processador = "Apple A12 Bionic";
	}
}
