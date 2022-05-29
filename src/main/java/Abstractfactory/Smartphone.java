package Abstractfactory;

import Abstractfactory.Smartphones.Intermediario;
import Abstractfactory.Smartphones.Entrada;

public interface Smartphone {
	Entrada criarSmartEntrada();
	Intermediario criarSmartIntermediario();
}
