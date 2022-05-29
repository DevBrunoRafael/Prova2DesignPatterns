package Builder;

public class EmpresaDirector {
	protected SmartphoneBuilder montadora;
	 
    public EmpresaDirector(SmartphoneBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirSmartphone() {
        montadora.buildNome();
        montadora.buildPreco();
        montadora.buildMemoria();
        montadora.buildTela();
        montadora.buildCamera();
        montadora.buildProcessador();
    }

    public SmartphoneProduct getSmartphone() {
        return montadora.getSmartphone();
    }
}
