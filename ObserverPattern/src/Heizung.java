import java.util.ArrayList;
// main: sollte heizwert ver�ndern, davor aber objekte instanzieren zB heizung, 
// hausverwalutung und meister, 
//hausverwalter muss bei heizung mit sich subscribe
public class Heizung implements IHeizObserver{

	private int temp= 21;

	ArrayList<IBeobachter> beobachterL =  new ArrayList<IBeobachter>(); 

	@Override
	public void aboHinzufuegen(IBeobachter beobachter) {
		this.beobachterL.add(beobachter);
	}

	@Override
	public void aboEntfernen(IBeobachter beobachter) {
		this.beobachterL.remove(beobachter);
	}

	public void notifyBeobachter() {
		for (IBeobachter beobachter : beobachterL) {
			beobachter.update();
		}
	}	

	public int getHeizWert(){
		System.out.println("Heizwert betr�gt: " +temp +" �C");
		return temp;
	}

	public void setHeizWert(int t){
		this.temp = t; 
		System.out.println("Heizwert wird um "+t+" erh�ht/vermindert, betr�gt nun: "+getHeizWert()+" �C");
		this.notifyBeobachter();
	}

}