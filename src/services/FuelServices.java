package services;
import models.FuelPump;

public class FuelServices {
    
	private FuelPump pump;
	
	public FuelServices(FuelPump pump) {
		this.pump = pump;
	}
	
	public void supplyByValue(double value) {
		double liter = value / this.pump.getFuelPrice();
		System.out.printf("Combustivel: %s\nValor: %.2f\nLitros %.2f", this.pump.getFuelType(), value, liter);
	}
	
}
