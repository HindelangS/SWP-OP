import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/**erzeugen von Context */
		StrategyContext ctx= new StrategyContext();
		StrategyContext ctx1= new StrategyContext();
		StrategyContext ctx2= new StrategyContext();
		
		/**erzeugen der Strategy */
		ctx.setStrategy(new StrategyZip());
		ctx1.setStrategy(new StrategyRar());
		ctx2.setStrategy(new Strategy7Zip());
		
		/**Daten erzeugen */
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("file1.txt");
		ArrayList<String> arrayList1= new ArrayList<>();
		arrayList1.add("file2.txt");
		ArrayList<String> arrayList2= new ArrayList<>();
		arrayList2.add("file3.txt");

		/**ausführen der gesetzten Strategy*/
		
		ctx.executeStrategy(arrayList);
		ctx2.executeStrategy(arrayList1);
		ctx1.executeStrategy(arrayList1);
		ctx2.executeStrategy(arrayList2);
	}
	
	

}
