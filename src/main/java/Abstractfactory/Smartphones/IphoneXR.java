package Abstractfactory.Smartphones;

import Builder.EmpresaDirector;
import Builder.SmartphoneProduct;
import Builder.iphoneXRBuilder;
import GeradorSingleton.GeradorId;

public class IphoneXR implements Entrada {

	GeradorId geradorId = GeradorId.getInstance();
	private final int id = geradorId.gerarId();
	private String nome;
	private double preco;
	private String tela;
	private int memoria;
	private int camera;
	private String processador;

	@Override
	public void construirSmartEnt() {
		// Builder =====================================================================================================
		EmpresaDirector empresa3 = new EmpresaDirector(new iphoneXRBuilder());
		empresa3.construirSmartphone();
		SmartphoneProduct IphoneXR = empresa3.getSmartphone();
		// =============================================================================================================

		this.nome = IphoneXR.nome;
		this.preco = IphoneXR.preco;
		this.tela = IphoneXR.tela;
		this.memoria = IphoneXR.memoria;
		this.camera = IphoneXR.camera;
		this.processador = IphoneXR.processador;

	}

	public String exibirInf() {
		return  "\nId: " + id +
				"\nNome: " + nome +
				"\nPreço: " + preco +
				"\nTela: " + tela +
				"\nMemória: " + memoria +
				"\nCâmera: " + camera +
				"\nProcessador: " + processador;
	}

	public int getId() {
		return id;
	}
}
