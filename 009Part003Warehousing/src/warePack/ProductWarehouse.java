package warePack;

import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {
	String productName;
	ChangeHistory historial= new ChangeHistory();
	
	
	public ProductWarehouse(String productName, double capacity) {
		super(capacity);
		this.productName=productName;
		this.historial=historial;
	}
	
	public ProductWarehouse(String productName, double capacity,ChangeHistory historial) {
		super(capacity);
		this.productName=productName;
		this.historial=historial;
	}
	
	public ChangeHistory getHistorial() {
		return historial;
	}

	public void setHistorial(ChangeHistory historial) {
		this.historial = historial;
	}

	public String getName() {
		return productName;
	}
	public void setName(String productName) {
		this.productName = productName;
	}
	
	public String toString() {
		//return "Capacity:" +100*load/capacity+"%";
		return super.toString();
	}
	


	
}
