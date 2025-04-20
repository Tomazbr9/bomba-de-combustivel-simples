package aplication;
import models.FuelPump;
import services.FuelServices;

public class Program {

	public static void main(String[] args) {
		FuelPump pump = new FuelPump("Gasolina Comum", 5.99, 5000);
		FuelServices service = new FuelServices(pump);
		
		service.supplyByValue(50.00);
		
	}
}
