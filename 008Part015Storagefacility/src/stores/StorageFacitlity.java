package stores;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacitlity {
	HashMap<String, ArrayList<String>> storeReference= new HashMap<String, ArrayList<String>>();
	
	public StorageFacitlity() {
		this.storeReference=storeReference;
	}
	
	public HashMap<String, ArrayList<String>> getStoreReference() {
		return storeReference;
	}

	public void setStoreReference(HashMap<String, ArrayList<String>> storeReference) {
		this.storeReference = storeReference;
	}

	public void add(String unit, String item) {
		boolean control=true;
		for(String reference: this.storeReference.keySet()) {
			if(reference.equals(unit)) {
				this.getStoreReference().get(unit).add(item);
				control=false;
				break;
			}
		}
		if(control) {
			ArrayList<String> itemList=new ArrayList<String>();
			itemList.add(item);
			this.getStoreReference().put(unit, itemList);
		}
			
	}
	
	public ArrayList<String> contents(String storageUnit){
		
		for(String reference: this.storeReference.keySet()) {
			if(reference.equals(storageUnit)) {
				return this.storeReference.get(storageUnit);
			}
		}
		return null;
	}
	
	public void remove(String storageUnit, String item) {
		for(String reference: this.storeReference.keySet()) {
			if(reference.equals(storageUnit)) {
				this.getStoreReference().get(storageUnit).remove(item);
				break;
			}
		}
	}
	
	public ArrayList<String> storageUnits(){
		ArrayList<String> list= new ArrayList<String>();
		for(String reference: this.storeReference.keySet()) {
			list.add(reference);
		}
		return list;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storeReference == null) ? 0 : storeReference.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StorageFacitlity other = (StorageFacitlity) obj;
		if (storeReference == null) {
			if (other.storeReference != null)
				return false;
		} else if (!storeReference.equals(other.storeReference))
			return false;
		return true;
	}
}
