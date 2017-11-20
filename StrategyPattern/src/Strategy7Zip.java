import java.util.ArrayList;

public class Strategy7Zip implements Istrategy {

	@Override
	public void compress(ArrayList<String> files)
	{
		System.out.println("Compressing with 7Zip");
		
	}

}
