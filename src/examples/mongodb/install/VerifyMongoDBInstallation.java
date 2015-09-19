package examples.mongodb.install;

import java.net.UnknownHostException;
 
import java.util.List;
 
import com.mongodb.*;

public class VerifyMongoDBInstallation {

	public static void main(String[] args)throws UnknownHostException {
		 
		Mongo mongo = new Mongo("localhost", 27017);
		 
        List<String> dbs = mongo.getDatabaseNames();
        for (String db : dbs) {
            System.out.println(db);
        }
		
	}

}
