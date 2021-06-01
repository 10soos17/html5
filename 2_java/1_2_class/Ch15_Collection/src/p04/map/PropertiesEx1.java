package p04.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

//Properties: Map 계열
//            HashTable의 하위 클래스, Key,Value가 String으로 되어 있음
//            <key,Value> => <String,String>
public class PropertiesEx1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties =  new Properties();
       String path = PropertiesEx1.class.getResource("database.properties").getPath();
        URLDecoder.decode(path,"utf-8");
        properties.load(new FileReader(path));
        
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        
        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        
	}

}
