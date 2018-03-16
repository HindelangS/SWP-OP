/**
 *  Erstellt im Untericht am 16.10.17, SWP-OP
 * @author Sara Hindelang
 * @version 1 
 *
 */

public class Singleton {

	private static Singleton instance = null;
	
//	private Singleton(){	} //für wat
	
	private static int id=0;

	public static Singleton instance (){

		if (instance == null){
			id ++;
			instance = new Singleton();
			System.out.println("neuer Singleton wurde erstellt ( ID: "+id+")");
		}
		else{
			System.out.println("Achtung, es wurde bereites ein Singleton erstellt ( ID: "+id+")");
		}
		return instance;
	}
	
	public static void main(String[] args) {

		Singleton.instance();
		Singleton.instance();
		Singleton.instance();


	}
}
