public class Factory {

	public static IPizza createPizza(String pizza){
		
		if(pizza.equalsIgnoreCase("Margaritha")) {
			return new Magaritha();
		}
		else if(pizza.equalsIgnoreCase("Spinaci")) {
			return new Spinaci();
		}
		else if(pizza.equalsIgnoreCase("Calzone")) {
			return new Calzone();
		}else {
			return null;
		}	
	}
}
