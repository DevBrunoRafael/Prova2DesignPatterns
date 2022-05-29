package Abstractfactory.Smartphones;

import Builder.A30sBuilder;
import Builder.EmpresaDirector;
import Builder.SmartphoneProduct;
import GeradorSingleton.GeradorId;

public class A30s implements Entrada {

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
		EmpresaDirector empresa = new EmpresaDirector(new A30sBuilder());
		empresa.construirSmartphone();
		SmartphoneProduct A30s = empresa.getSmartphone();
		//  ============================================================================================================

		this.nome = A30s.nome;
		this.preco = A30s.preco;
		this.tela = A30s.tela;
		this.memoria = A30s.memoria;
		this.camera = A30s.camera;
		this.processador = A30s.processador;
	}

	@Override
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
