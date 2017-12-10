
public class Hausverwaltung implements IBeobachter {

	private Heizung hz;

	public Hausverwaltung(Heizung z) {
		this.hz= z; 
		this.hz.aboHinzufuegen(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		int newTemp = Heizung.getHeizWert();
		
	}
	
	
}
