
public class Hausmeister implements IBeobachter{

	private Heizung hz;

	public Hausmeister(Heizung z) {

		System.out.println("Ich bin der Hausmeister und wurde soeben erstellt");
		hz= z; 
		z.aboHinzufuegen(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("UPDATE: ");
		double newTemp = hz.getHeizWert();
	}

}
