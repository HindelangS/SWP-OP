
public class Hausmeister implements IBeobachter{

	private Heizung hz;

	public Hausmeister(Heizung z) {
		this.hz= z; 
		this.hz.aboHinzufuegen(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		int newTemp = Heizung.getHeizWert();
	}

}