package aplication;
import models.FuelPump;
import services.FuelServices;

public class Program {

	public static void main(String[] args) {
		FuelPump pump = new FuelPump("Gasolina Comum", 5.99, 2);
		FuelServices service = new FuelServices(pump);
		
		service.supplyByLiter(5);
	
		
	}
}
