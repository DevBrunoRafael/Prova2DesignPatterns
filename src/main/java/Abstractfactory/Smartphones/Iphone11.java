package Abstractfactory.Smartphones;

import Builder.EmpresaDirector;
import Builder.SmartphoneProduct;
import Builder.iphone11Builder;
import GeradorSingleton.GeradorId;

public class Iphone11 implements Intermediario {

	GeradorId geradorId = GeradorId.getInstance();
	private final int id = geradorId.gerarId();
	private String nome;
	private double preco;
	private String tela;
	private int memoria;
	private int camera;
	private String processador;

	@Override
	public void construirSmartInt() {
		// Builder =====================================================================================================
		EmpresaDirector empresa = new EmpresaDirector(new iphone11Builder());
		empresa.construirSmartphone();
		SmartphoneProduct Iphone11 = empresa.getSmartphone();
		//  ============================================================================================================

		this.nome = Iphone11.nome;
		this.preco = Iphone11.preco;
		this.tela = Iphone11.tela;
		this.memoria = Iphone11.memoria;
		this.camera = Iphone11.camera;
		this.processador = Iphone11.processador;
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
