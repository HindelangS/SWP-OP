import java.util.ArrayList;

/**
 * 
 * @author Sara
 * Zeigt Inhalt von Ordner an, kann wieder Ordner oder entgültige Datei sein 
 *
 */
public class Ordner extends Explorer{

	ArrayList<Explorer> child = new ArrayList<>();
	
	@Override
	public void anlegen() {
		// TODO Auto-generated method stub
		System.out.println("Ordner wurde angelegt");
		
	}

	@Override
	public void anzeigen() {
		// TODO Auto-generated method stub, Ausgabe aller Kinder
		System.out.println("Anzeige: *Ordner*");
		
	}
	
	public void addChild(Explorer c) {
		child.add(c);
	}
	
	public Explorer getChild(int pos) {
		return child.get(pos);
	}
	
	public void removeChild(int pos) {
		child.remove(pos);
		
	}

	@Override
	public int getAnzInhalt() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < child.size(); i++) {
			sum += child.get(i).getAnzInhalt();
		}
		return sum;
	}
}