
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figur f = new Figur();
		int m = 2;
		
		VorCmd cmd = new VorCmd(f, m);
		
		cmd.doIt(); //Führt Komando aus bam 
		cmd.doIt();
		
		System.out.println("Figur: "+ f + " ging "+m+" Meter.");
		

	}

}
