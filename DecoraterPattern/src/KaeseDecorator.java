
public class KaeseDecorator extends ZutatenDecorator {
	
	public KaeseDecorator(Pizza pizza) {
		this.pizza = pizza; 
	}
	
	public String getBeschreibung() {
		return this.pizza.getBeschreibung() + " mit K�se";
	}

	public float preis(){
		return this.pizza.preis() +1.50f;
	}
}