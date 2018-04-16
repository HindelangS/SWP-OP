
public class AnanasDekorator extends ZutatenDecorator {

	public AnanasDekorator(Pizza pizza) {
		this.pizza = pizza; 
	}
	
	public String getBeschreibung() {
		return this.pizza.getBeschreibung() + " mit Ananas";
	}

	public float preis(){
		return this.pizza.preis() +0.50f;
	}
}