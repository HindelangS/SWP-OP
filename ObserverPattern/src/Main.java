/**
 * Client.java
 */
public class Main {

	public static void main(String[] args) {

		Heizung hz = new Heizung();

		/** Erzeugung des Beobachters. Dabei wird
		 * das Subjekt übergeben und registriert. **/
		Hausmeister hm = new Hausmeister(hz);

		/** Zustandsänderung, Subjekt benachrichtigt
		 * daraufhin die Beobachter **/
		Heizung.setHeizWert(21);
	}
}