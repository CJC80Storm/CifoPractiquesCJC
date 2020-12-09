package warePack;

import java.util.ArrayList;

public class ChangeHistory {
	
	ArrayList<Double> stores=new ArrayList<Double>();
	
	public ChangeHistory() {
		this.stores = stores;
	}
	
	public ArrayList<Double> getStores() {
		return this.stores;
	}

	public void setStores(ArrayList<Double> stores) {
		this.stores = stores;
	}
	
	public void add(double status) {
		this.stores.add(status);
	}
	
	public void clear() {
		//empties the history.
		int position=0;
		while(position>stores.size()) {
			this.stores.remove(position);
			position++;
		}
	}

	@Override
	public String toString() {
		if(this.stores.size()==0){
			return "No Store for this product.";
		} else if(this.stores.size()==1) {
			return "status: " + stores.get(0)+ "and there is an historial of "+stores.size()+" changes. ["+this.stores.toString()+"].";
		} 
		return "status: " + this.stores.get(this.stores.size()-1)+ "and there is an historial of "+stores.size()+" changes. ["+this.stores.toString()+"].";
	}
	
	public double maxValue() {
		double variable=0.0;
		int position=0;
		
		if(this.stores.size()<=0) {
			return 0.0;
		} else if(this.stores.size()==1){
			return this.stores.get(0);
		} else if(this.stores.size()>1) {
			variable=this.stores.get(position);
			while(position<=this.stores.size()) {
				if(variable<this.stores.get(position)) {
					variable=this.stores.get(position);
				} 
				position++;
			}
		}
		return variable;
	}
	
	public double minValue() {
		
		double variable=0.0;
		int position=0;
		
		if(this.stores.size()<=0) {
			return 0.0;
		} else if(this.stores.size()==1){
			return this.stores.get(0);
		} else if(this.stores.size()>1) {
			variable=this.stores.get(position);
			while(position<=this.stores.size()) {
				if(variable>this.stores.get(position)) {
					variable=this.stores.get(position);
				} 
				position++;
			}
		}
		return variable;
	}
		
	public double average() 
	{
		double variable=0.0;
		int position=0;
		
		if(this.stores.size()<=0) {
			return 0.0;
		} else if(this.stores.size()==1){
			return this.stores.get(0);
		} else if(this.stores.size()>1) {
			variable=this.stores.get(position);
			while(position<=this.stores.size()) {
				variable=variable+this.stores.get(position);
				position++;
			}
		}
		return variable/this.stores.size();
	}

}
