/**
 * Client.java
 */
public class Main {

	public static void main(String[] args) {

		Heizung hz = new Heizung();

		/** Erzeugung des Beobachters. Dabei wird
		 * das Subjekt �bergeben und registriert. **/
		Hausmeister hm = new Hausmeister(hz);

		/** Zustands�nderung, Subjekt benachrichtigt
		 * daraufhin die Beobachter **/
		Heizung.setHeizWert(21);
	}
}