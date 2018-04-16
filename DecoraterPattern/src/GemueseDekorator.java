
public class GemueseDekorator extends ZutatenDecorator {
	
	public GemueseDekorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getBeschreibung() {
		return this.pizza.getBeschreibung() + " mit Gemuese";
	}

	public float preis() {
		return this.pizza.preis() + 1.50f;
	}

}
