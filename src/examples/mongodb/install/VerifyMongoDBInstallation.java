package examples.mongodb.install;

import java.net.UnknownHostException;
 
import java.util.List;
 
import com.mongodb.*;

public class VerifyMongoDBInstallation {
	
	/*
	 Estoy probando github como es la cosa del trabajo de equipo
	*/
	
	
	public static void main(String[] args)throws UnknownHostException {
		 
		Mongo mongo = new Mongo("localhost", 27017);
		 
        	List<String> dbs = mongo.getDatabaseNames();
        	
		//Llamo al metodo que muestra las dbs
		mostrarDB(dbs);        
		
	}
	
	public static void mostrarDB(List<String> dbs){
	 for (String db : dbs) {
           System.out.println(db);
         }	
		
	}

}
