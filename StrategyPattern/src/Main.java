import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//erzeugen von COntext
		StrategyContext ctx= new StrategyContext();
		StrategyContext ctx1= new StrategyContext();
		StrategyContext ctx2= new StrategyContext();
		
		//erzeugen der Strategy
		ctx.SetStrategy(new StrategyZip());
		ctx1.SetStrategy(new StrategyRar());
		ctx2.SetStrategy(new Strategy7Zip());
		
		//Daten erzeugen
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("file.txt");
		ArrayList<String> arrayList1= new ArrayList<>();
		arrayList1.add("files.txt");
		ArrayList<String> arrayList2= new ArrayList<>();
		arrayList2.add("files.txt");

		//ausführen der gesetzten Strategy
		ctx.executeStrategy(arrayList);
		ctx1.executeStrategy(arrayList1);
		ctx2.executeStrategy(arrayList2);
	}
	
	

}
