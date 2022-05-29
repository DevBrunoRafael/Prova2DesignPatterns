package Abstractfactory;

import Abstractfactory.Smartphones.Entrada;
import Abstractfactory.Smartphones.Intermediario;
import Abstractfactory.Smartphones.Iphone11;
import Abstractfactory.Smartphones.IphoneXR;

public class IOS implements Smartphone {


	@Override
	public Entrada criarSmartEntrada() {
		return new IphoneXR();
	}

	@Override
	public Intermediario criarSmartIntermediario() {
		return new Iphone11();
	}
}
