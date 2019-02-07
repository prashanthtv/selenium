package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	//HashMap<String, String> obj2 = new HashMap<String, String>();
	HashMap<String, String> hmap = new HashMap<String, String>();
	hmap.put("1", "Prashanth");
	hmap.put("2", "MindTree");
	hmap.put("3", "Happiestminds");
	hmap.put("4", "QTP");
	hmap.put("5", "Selenium");
	hmap.put("6", "Katalon Studio");
	hmap.put("8", "DELL");
	hmap.put("8", "DELL");
	hmap.put("10", "test");
	hmap.put("112", "test1");
	System.out.println("The list of valules is:"+hmap);
	
	//Set<Map.Entry<String,String>> entrySet()
	Set<Map.Entry<String, String>> data=hmap.entrySet();
	
	//String value =hmap.get("112");
	//System.out.println("Value is:"+value);
	}

}
