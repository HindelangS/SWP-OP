import java.util.ArrayList;

public class Heizung implements IHeizObserver{

	double temp= 21;
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

	public double getHeizWert(){
		System.out.println("GET: Heizwert beträgt: " +temp +" °C");
		return temp;
	}

	public void setHeizWert(double t){
		this.temp = temp +  t; 
		System.out.println("SET: Heizwert wurde auf: "+getHeizWert()+" °C"+" geändert");
		this.notifyBeobachter();
	}

}
