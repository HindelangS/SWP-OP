import java.util.ArrayList;

public class Magaritha implements IPizza{

	@Override
	public void zubereitung() {
		// TODO Auto-generated method stub
		System.out.println("Pizza 'Margaritha' wird zubereitet...");
		
	}

	@Override
	public ArrayList<Zutat> getZutaten() {
		
		ArrayList<Zutat> zutaten = new ArrayList<Zutat>();;
		
		Zutat z1 = new Zutat("Teig");
		Zutat z2 = new Zutat("Tomatensauce");
		Zutat z3 = new Zutat("Käse");
		
		zutaten.add(z1);
		zutaten.add(z2);
		zutaten.add(z3);
		
		System.out.println("Folgende Pizza 'Margaritha' Zutaten werden hergeholt: ");
		
		for(int i = 0; i < zutaten.size(); i ++) {
			System.out.println("\t "+(i+1)+": "+zutaten.get(i).ding);
		}
		return zutaten;
		
	}
}