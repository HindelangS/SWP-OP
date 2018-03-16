/**
 * Stellt Objekt dar, welches Beobachtet wird, kann entwerder Beobachter hinzuf�gen, entfernen oder benachrichtigens
 * @author Sara 
 */
public interface IHeizObserver {
	
	public void aboEntfernen(IBeobachter beob);
	
	public void aboHinzufuegen(IBeobachter beob);
	
	public void notifyBeobachter();
	

}
