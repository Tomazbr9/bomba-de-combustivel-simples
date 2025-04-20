package models;

public class FuelPump {
    private String fuelType;
    private double fuelPrice;
    private double fuelAmount;
    
    public FuelPump(String fuelType, double fuelPrice, double fuelAmount) {
    	this.fuelType = fuelType;
    	this.fuelPrice = fuelPrice;
    	this.fuelAmount = fuelAmount;
    }

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getFuelPrice() {
		return fuelPrice;
	}

	public void setFuelPrice(double fuelPrice) {
		this.fuelPrice = fuelPrice;
	}

	public double getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	@Override
	public String toString() {
		return "FuelPump [fuelType=" + fuelType + ", fuelPrice=" + fuelPrice + ", fuelAmount=" + fuelAmount + "]";
	}
    
    
}
