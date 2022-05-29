package Abstractfactory.Smartphones;

import Builder.EmpresaDirector;
import Builder.SmartphoneProduct;
import Builder.pocoX3Builder;
import GeradorSingleton.GeradorId;

public class PocoX3 implements Intermediario {

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
		EmpresaDirector empresa2 = new EmpresaDirector(new pocoX3Builder());
		empresa2.construirSmartphone();
		SmartphoneProduct Pocox3 = empresa2.getSmartphone();
		// =============================================================================================================

		this.nome = Pocox3.nome;
		this.preco = Pocox3.preco;
		this.tela = Pocox3.tela;
		this.memoria = Pocox3.memoria;
		this.camera = Pocox3.camera;
		this.processador = Pocox3.processador;
	}

	public String exibirInf() {
		return 	"\nId: " + id +
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
