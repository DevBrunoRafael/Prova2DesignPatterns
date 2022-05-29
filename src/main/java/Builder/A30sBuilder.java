package Builder;

public class A30sBuilder extends SmartphoneBuilder {
	@Override
	public void buildNome() {
		smartphone.nome = "A30s";
	}
	@Override
	public void buildPreco() {
		smartphone.preco = 1405;
	}
	@Override
	public void buildTela() {
		smartphone.tela = "SuperAMOLED 6.4";
	}
	@Override
	public void buildMemoria() {
		smartphone.memoria = 64;
	}
	@Override
	public void buildCamera() {
		smartphone.camera = 16;
	}
	@Override
	public void buildProcessador() {
		smartphone.processador = "Exynos 7 octa 7904";
	}
}
