package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

    public static void main(String[] args) throws Exception {
        /*
		* Demonstrate how to use Map that includes storing and retrieving elements.
		* Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		* Use For Each loop and while loop with Iterator to retrieve data.
		*
	    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		*/


        //implementation here


        //connect to database
		ConnectDB ct = new ConnectDB();

		Map<String,String> personalInfo =new HashMap<>();

		personalInfo.put("first name","manel");
		personalInfo.put("last name","ketem");
		personalInfo.put("cellphone","3213938490");
		personalInfo.put("email address","manel90@gmail.com");
		System.out.println(personalInfo.get("cellphone"));
		for(Map.Entry entry:personalInfo.entrySet()){
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		List<String> citiesOfalgeria =new ArrayList<>();
		citiesOfalgeria.add("alg");
		citiesOfalgeria.add("ouron");
		citiesOfalgeria.add("anaba");

		List<String> citiesOffrance =new ArrayList<>();
		citiesOffrance.add("paris");
		citiesOffrance.add("lyon");
		citiesOffrance.add("marseille");

		List<String> citiesOfENGLAND =new ArrayList<>();
		citiesOfENGLAND.add("london");
		citiesOfENGLAND.add("manchester");
		citiesOfENGLAND.add("leeds");

		Map<String,List<String>>map=new HashMap<>();
		map.put("algeria",citiesOfalgeria);
		map.put("france",citiesOffrance);
		map.put("ENGLAND",citiesOfENGLAND);

		System.out.println(map.get("algeria"));
		for(Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey()+""+entry.getValue());
		}




	}
}

