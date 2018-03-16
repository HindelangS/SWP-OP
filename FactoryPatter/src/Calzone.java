import java.util.ArrayList;

public class Calzone implements IPizza{

	@Override
	public void zubereitung() {
		// TODO Auto-generated method stub
		System.out.println("Pizza 'Calzone' wird gefaltet...");
		System.out.println(" & zubereitet...");
		
	}

	@Override
	public ArrayList<Zutat> getZutaten() {
		
		ArrayList<Zutat> zutaten = new ArrayList<Zutat>();;
		
		Zutat z1 = new Zutat("Teig");
		Zutat z2 = new Zutat("Tomatensauce");
		Zutat z3 = new Zutat("Käse");
		Zutat z4 = new Zutat("Gemüse");
		
		zutaten.add(z1);
		zutaten.add(z2);
		zutaten.add(z3);
		zutaten.add(z4);
		
		System.out.println("Folgende Pizza 'Calzone' Zutaten werden hergeholt: ");
		
		for(int i = 0; i < zutaten.size(); i ++) {
			System.out.println("\t "+i+": "+zutaten.get(i).ding);
		}
		return zutaten;
		
	}

}
