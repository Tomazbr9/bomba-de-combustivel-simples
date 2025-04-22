package services;
import models.FuelPump;

public class FuelServices {
    
	private FuelPump pump;
	
	public FuelServices(FuelPump pump) {
		this.pump = pump;
	}
	
	public double lowerAmount(double liter, double amount) {
		liter = amount;
	    double value = liter * this.pump.getFuelPrice();
	    return value;
	}
	
	public void supplyByValue(double value) {
		double amount = this.pump.getFuelAmount();
		double liter = value / this.pump.getFuelPrice();
		
		if(amount < liter) {
			liter = amount;
			value = liter * this.pump.getFuelPrice();
		}
		
		System.out.printf("Combustivel: %s\nValor: %.2f\nLitros %.2f", this.pump.getFuelType(), value, liter);
	}
	
	public void supplyByLiter(double liter) {
		double amount = this.pump.getFuelAmount();
		double value;
		if(amount < liter) {
			liter = amount;
		    value = liter * this.pump.getFuelPrice();
		}
		else {
			value = liter * this.pump.getFuelPrice();
		}
		
		System.out.printf("Combustivel: %s\nValor: %.2f\nLitros %.2f", this.pump.getFuelType(), value, liter);
	
	}
	
}
