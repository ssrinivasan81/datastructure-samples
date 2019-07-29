package com.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser jsonparser = new JSONParser();
		System.out.println("-1-");
		try (FileReader reader = new FileReader("C:\\Srini\\project datas\\LOUISA2\\JSon Triplet\\Json_Dev.json")) {
			Object obj = jsonparser.parse(reader);
			
			JSONArray tripletlist = (JSONArray) obj;
			System.out.println("--"+tripletlist);
			
			tripletlist.forEach( emp -> parseTripletObject( (JSONObject) emp ) );
			System.out.println("-2-");
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	
	private static void parseTripletObject(JSONObject employee) 
	{
		String plantCode = (String) employee.get("plantCode");	
		System.out.println(plantCode);
		
		String plantName = (String) employee.get("marketCode");	
		System.out.println(plantName);
	}

}
