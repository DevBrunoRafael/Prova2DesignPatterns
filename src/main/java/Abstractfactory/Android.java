package Abstractfactory;

import Abstractfactory.Smartphones.A30s;
import Abstractfactory.Smartphones.Entrada;
import Abstractfactory.Smartphones.Intermediario;
import Abstractfactory.Smartphones.PocoX3;

public class Android implements Smartphone {


	@Override
	public Entrada criarSmartEntrada() {
		return new A30s();
	}

	@Override
	public Intermediario criarSmartIntermediario() {
		return new PocoX3();
	}
}
