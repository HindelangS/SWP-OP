
public class Main {
	
	public static void main(String[] args) {

		Ordner ordnerMain = new Ordner();
		
		ordnerMain.addChild(new Datei());
		ordnerMain.getChild(0).anlegen();
		ordnerMain.getChild(0).anzeigen();
		
		Ordner unterOrdner = new Ordner();
		unterOrdner.addChild(new Datei());
		unterOrdner.getChild(0).anlegen();
		unterOrdner.getChild(0).anzeigen();
		
		unterOrdner.addChild(new Datei());
		unterOrdner.getChild(1).anlegen();
		unterOrdner.getChild(1).anzeigen();
		
		ordnerMain.addChild(unterOrdner);
		
		System.out.println("Der Inhalt des Unterordners1 beträgt: "+ unterOrdner.getAnzInhalt());

		System.out.println("Der Inhalt des gesamten Ordners beträgt: "+ ordnerMain.getAnzInhalt());
		 	
	}
}