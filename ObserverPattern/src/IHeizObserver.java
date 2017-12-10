/**
 * Beobachtet ein anderes Elment, wenn etwas passiert wird reagiert
 * zB bei Notengebung  
 * @author Sara
 * Inerface beinhaltet Methode die bei Update ausgeführt wird, meist subscribed und unsubscribed 
 *
 */
public interface IHeizObserver {
	
	public abstract void aboEntfernen(IBeobachter beob);
	
	public abstract void aboHinzufuegen(IBeobachter beob);
	
	public abstract void notifyBeobachter();
	

}
