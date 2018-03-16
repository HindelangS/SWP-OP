
public class User /*verwendet iPizza und called Facgory*/{

	public static void main(String[] args)
	{

		IPizza pizzaM = Factory.createPizza("Margaritha");
		IPizza pizzaS = Factory.createPizza("Spinaci");
		IPizza pizzaC = Factory.createPizza("Calzone");
		
		IPizza pizzaka = Factory.createPizza("iwoasesnonit");
		
		System.out.println("--- Herzlich willkommen in der Pizzafabrik ---");
		System.out.println();

		if(pizzaM != null) {
			pizzaM.getZutaten();
			pizzaM.zubereitung();
		}else {
			System.out.println("--- DIESE PIZZA IST NICHT VERFÜGBAR, BITTE ANDERE WÄHLEN ---");
		}

		System.out.println("--- bitte holen Sie Ihre Bestellung ab ---");
		System.out.println();
		
		if(pizzaS != null) {
			pizzaS.getZutaten();
			pizzaS.zubereitung();
		}else {
			System.out.println("--- DIESE PIZZA IST NICHT VERFÜGBAR, BITTE ANDERE WÄHLEN ---");
		}
		
		System.out.println("--- bitte holen Sie Ihre Bestellung ab ---");
		System.out.println();

		if(pizzaC != null) {
			pizzaC.getZutaten();
			pizzaC.zubereitung();
		}else {
			System.out.println("--- DIESE PIZZA IST NICHT VERFÜGBAR, BITTE ANDERE WÄHLEN ---");
		}
		
		System.out.println("--- bitte holen Sie Ihre Bestellung ab ---");
		System.out.println();

		if(pizzaka != null) {
			pizzaka.getZutaten();
			pizzaka.zubereitung();
		}else {
			System.out.println("--- Achtung.. DIESE PIZZA IST NICHT VERFÜGBAR, BITTE ANDERE WÄHLEN ---");
		}
		
		System.out.println();
		System.out.println("--- vielen Dank für Ihren Besuch ---");
		System.out.println();
	}
}