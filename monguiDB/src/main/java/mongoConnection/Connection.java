package mongoConnection;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Connection {
	
	public static void main(String[] args) {
		// create connection string to connect to cloud mongo with user/password
		// generated by security/database access
		// watch out the IP, pal!
		// string connection from Atlas/Connect
		MongoClientURI connectionString = new MongoClientURI("mongodb+srv://cifo:1234@clustertest.0h8fd.mongodb.net/test");
		// create object mongoClient: object to connect, manage, get DBs, handle, ...
		// CRUD, clean, etc ...
		MongoClient mongoClient = new MongoClient(connectionString);

		// getter from mongo to get db, particularly CITY
		MongoDatabase database = mongoClient.getDatabase("city");
		// collection CARS
		MongoCollection<Document> collection = database.getCollection("cars");

		System.out.println("Number of cars in my CAR collection: "+collection.countDocuments());

		// query to my collection and find the first document and then transform to JSON
		// in order to print that document as JSON and STRING
		Document myDoc = collection.find().first();
		System.out.println(myDoc.toJson());
		System.out.println(myDoc.toString());

		// create a new Car as a DOCUMENT
		Document car = new Document("_id", new ObjectId());
		// set the document with APPEND
		car.append("make", "Magda").append("price", 5000d).append("designeBy", "Martinelli, Sonia");
		// add that document to CARS collection
		collection.insertOne(car);

		System.out.println("New document, new car: " + collection.countDocuments());

		// print all documents from my collection CARS
		for (Document carToPrint : collection.find()) {
			System.out.println(carToPrint.toJson());
		}

	}

}
