import java.util.ArrayList;

public class StrategyZip implements Istrategy{

	public void compress(ArrayList<String> files)
	{
		System.out.println("Compressing with ZIP: "+ files);
	}
}
