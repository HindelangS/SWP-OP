
public class Main {

	public static void main(String[] args) {
		
		Pizza pizzaKL = new KleinePizza();
		
		pizzaKL = new GemueseDekorator(pizzaKL);
		pizzaKL = new MaisDecorator(pizzaKL);
		pizzaKL = new KaeseDecorator(pizzaKL);
		
		System.out.println("1. : "+pizzaKL.getBeschreibung());
		System.out.println(""+pizzaKL.preis());
		
		System.out.println("----");
		
		Pizza pizzaGr = new GrossePizza();
		
		pizzaGr = new GemueseDekorator(pizzaGr);
		pizzaGr = new MaisDecorator(pizzaGr);
		pizzaGr = new AnanasDekorator(pizzaGr);
		
		System.out.println("2. : "+pizzaGr.getBeschreibung());
		System.out.println(""+pizzaGr.preis());
		

		
	}

}
