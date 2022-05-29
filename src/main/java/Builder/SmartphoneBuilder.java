package Builder;

public abstract class SmartphoneBuilder {
	protected SmartphoneProduct smartphone = new SmartphoneProduct();
	public abstract void buildNome();

	public abstract void buildPreco();
	public abstract void buildTela();
	public abstract void buildMemoria();
	public abstract void buildCamera();
	public abstract void buildProcessador();
	public SmartphoneProduct getSmartphone(){
		return smartphone;
	};
}
