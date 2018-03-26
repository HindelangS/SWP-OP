
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompositUntersuchung uMain = new CompositUntersuchung();
		
		uMain.addChild(new Fiebermessen());
		
		CompositUntersuchung kleineUntersuchung = new CompositUntersuchung();
		kleineUntersuchung.addChild(new Fiebermessen());
		kleineUntersuchung.getChild(0).operation();
		kleineUntersuchung.addChild(new Blutdruckmessen());
		kleineUntersuchung.getChild(1).operation();
		
		CompositUntersuchung miniUntersuchung = new CompositUntersuchung();
		miniUntersuchung.addChild(new Fiebermessen());
		miniUntersuchung.getChild(0).operation();
		miniUntersuchung.addChild(new Blutdruckmessen());
		miniUntersuchung.getChild(1).operation();
		
		kleineUntersuchung.addChild(miniUntersuchung);
		uMain.addChild(kleineUntersuchung);
		
		System.out.println("Preis für die gesamte Untersuchung beträgt: "+ uMain.getPrize()+"€");
		
	}
	

}
