import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//erzeugen von COntext
		StrategyContext ctx= new StrategyContext();
		
		//erzeugen der Strategy
		ctx.SetStrategy(new StrategyZip());
		
		//Daten erzeugen
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("file.txt");

		//ausführen der gesetzten Strategy
		ctx.executeStrategy(arrayList);
	}
	
	

}
