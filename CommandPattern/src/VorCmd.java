
public class VorCmd implements ICommand{

	private Figur f;
	private int meter; 
	
	public VorCmd(Figur f, int meter) {
		this.f = f; //Datenkapselung durch Konstruktor mit verwendung ovn privaten Variablen dass Wert passt
		this.meter = meter; 
	}
	
	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		f.vor(meter);
	}

	@Override
	public void unDoIt() {
		// TODO Auto-generated method stub
		f.vor(-meter);
	}

}
