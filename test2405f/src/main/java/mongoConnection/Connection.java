package mongoConnection;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Connection {

	public static void main(String[] args) {
		
		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://cifo:1234@clustertest.0h8fd.mongodb.net/test");
		
		MongoClient mongoClient = new MongoClient(connectionString);

		MongoDatabase database = mongoClient.getDatabase("library");
		
		MongoCollection<Document> collection = database.getCollection("books");

		System.out.println("Number of cars in my Book collection: " + collection.countDocuments());

				Document myDoc = collection.find().first();
		System.out.println(myDoc.toJson());
		System.out.println(myDoc.toString());

		
		Document book = new Document("_id", new ObjectId());
		
		book.append("make", "Magda").append("price", 5000d).append("designeBy", "Martinelli, Sonia");
		
		collection.insertOne(book);

		System.out.println("New document, new book: " + collection.countDocuments());

		
		for (Document bookToPrint : collection.find()) {
			System.out.println(bookToPrint.toJson());
		}

	}

}
