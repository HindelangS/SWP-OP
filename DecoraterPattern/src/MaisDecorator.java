
public class MaisDecorator extends ZutatenDecorator {
	
	public MaisDecorator(Pizza pizza) {
		this.pizza = pizza; 
	}
	
	public String getBeschreibung() {
		return this.pizza.getBeschreibung() + " mit Mais";
	}

	public float preis(){
		return this.pizza.preis() +0.90f;
	}
}