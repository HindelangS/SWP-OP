
public class Hausverwaltung implements IBeobachter {

	private Heizung hz;

	public Hausverwaltung(Heizung z) {

		System.out.println("Ich bin die Hausverwaltung und wurde soeben erstellt");
		hz = z; 
		z.aboHinzufuegen(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("UPDATE: ");
		double newTemp = hz.getHeizWert();
		
	}
	
	
}
