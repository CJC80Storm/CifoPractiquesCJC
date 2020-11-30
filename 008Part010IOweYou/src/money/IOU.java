package money;

import java.util.HashMap;

public class IOU {
	public HashMap<String, Double> hashmap;
	
	public IOU( ) {
		this.hashmap=new HashMap<>();
	}
	
	public HashMap<String, Double> getHashmap() {
		return hashmap;
	}

	public void setHashmap(HashMap<String, Double> hashmap) {
		this.hashmap = hashmap;
	}
	
	public void setSum(String toWhom, double amount) {
		if(hashmap.size()>0) {
			for(String h: hashmap.keySet()) {
				if(hashmap.keySet().equals(toWhom)) {
					hashmap.remove(toWhom);
					break;
				}
			}
		}
		hashmap.put(toWhom, amount);
		
	}

	public Double howMuchDoIOweTo(String word) {
		
		for(String h: hashmap.keySet()) {
			if(h.contains(word)){
				return  hashmap.get(h);
			}
		}
		return 0.0;
	}
	


	

}
