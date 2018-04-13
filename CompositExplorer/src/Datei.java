/**
 * 
 * @author Sara
 * Datei enthält Text oder ähnliches, ist Leaf, sprich hat keine Kinder oder Ähnliches 
 *
 */
public class Datei extends Explorer{

	@Override
	public void anlegen() {
		// TODO Auto-generated method stub
		System.out.println("Datei wurde angelegt");
	}

	@Override
	public void anzeigen() {
		// TODO Auto-generated method stub
		System.out.println("Anzeige: *Datei*");
		
	}

	@Override
	public int getAnzInhalt() {
		// TODO Auto-generated method stub
		return 1;
	}
}