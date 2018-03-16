/**
 * Client.java
 */
public class Main {

	public static void main(String[] args) {

		Heizung hz = new Heizung();

		/** Beobachter wird erzeugt und bekommt gleich zu beobachtendes Objekt mit **/
		
		Hausmeister hm = new Hausmeister(hz);
		Hausverwaltung hv = new Hausverwaltung(hz);

		System.out.println("---");
		
		/** Heizwert wird gesetzt und gibt gleich Nachricht darüber weiter **/
		hz.getHeizWert();
		System.out.println("--");
		hz.setHeizWert(3);

	}
}