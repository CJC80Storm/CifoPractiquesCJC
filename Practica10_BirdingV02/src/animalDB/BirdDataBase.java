package animalDB;

import java.util.ArrayList;
import animal.Bird;


public class BirdDataBase {
		ArrayList<Bird> birds=new ArrayList<Bird>();
		String nameDB;
		
		public BirdDataBase(ArrayList<Bird> birds,String NameDB) {
			this.nameDB=nameDB;
			this.birds=birds;
		}

		public ArrayList<Bird> getBirds() {
			return birds;
		}

		public void setBirds(ArrayList<Bird> birds) {
			this.birds = birds;
		}

		public String getNameDB() {
			return nameDB;
		}

		public void setNameDB(String nameDB) {
			this.nameDB = nameDB;
		}
		
		
}
