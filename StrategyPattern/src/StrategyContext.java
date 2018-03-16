import java.util.ArrayList;

public class StrategyContext {
	
	private Istrategy strategy;
	
	public void setStrategy (Istrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void executeStrategy(ArrayList<String> files)
	{
		this.strategy.compress(files);
	}

}
