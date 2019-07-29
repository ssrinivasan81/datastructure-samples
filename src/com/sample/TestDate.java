package com.sample;

import java.util.Date;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDate {
	public static final Locale locale = Locale.FRANCE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		LocalDate toCheckdate = today.minusDays(12);
		
		String datestr = "carnet_to_test.csv_2018-09-03-09.40.00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
		String string = datestr.substring(datestr.lastIndexOf("_")+1, datestr.lastIndexOf("_")+11);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string, formatter);
		System.out.println(date); 

		System.out.println("Date = "+ today.minusDays(12));
		System.out.println("Result = "+ date.isBefore(toCheckdate));
		
		/*System.out.println("First day: " + today.withDayOfMonth(1));
		List<String> carnetLines = new ArrayList<>();
		carnetLines.add("1;024;2018215;OF;XFE;HFE;BELGGP;VF1RFE00760972785;Vrai");
		carnetLines.add("2;024;2018213;OF;XFE;HFE;BELGGP;VF1RFE00760972785;Vrai");
		carnetLines.add("3;024;2018213;OF;XFE;HFE;BELGGP;VF1RFE00760972785;Vrai");
		carnetLines.add("4;024;2018253;OF;XFE;HFE;BELGGP;VF1RFE00760972785;Vrai");	
		
		List<String[]> lines = carnetLines.stream().map(l -> l.split(";")).collect(Collectors.toList());
		
		//collect needed values
		List<String> line = lines.stream()
				//.skip(1)
				.map(row -> row[7])
				.collect(Collectors.toList());
		
		System.out.println(line);
		
		System.out.println("_______________-");
		ClassLoader classLoader = new TestDate().getClass().getClassLoader(); //ClassLoader.getSystemClassLoader();
		String fileName1 = "D:\\Public\\Srini programs\\workspaces\\l2_integration\\api\\src\\main\\resources\\truststore_ca_renault.jks";
		File file = new File(classLoader.getResource(fileName1).getFile());
		
		
		System.out.println("------------->"+file.isFile());
		 
		String fileName = "D://Public//lines.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			//1. filter line 3
			//2. convert all content to upper case
			//3. convert it into a List
			list = stream					 
					.map(String::toUpperCase)
					.collect(Collectors.toList());

		} catch (Exception e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);
			
		
		List<String> lstvin = new ArrayList<>();
		lstvin.add("VF1VC000061271283");
		lstvin.add("VF1VC000261271270");
		lstvin.add("VF1VC000461271271");
		lstvin.add("VF1VC000561271277");
		lstvin.add("VF1VC000761271278");
		lstvin.add("VF1VC000761271281");
		lstvin.add("VF1VC000861271273");
		lstvin.add("VF1VC000961271279");
		
		String commaseparated = lstvin.stream()
				  .map(s -> "\'" + s + "\'")
				  .collect(Collectors.joining(", "));
		

		System.out.println(commaseparated);
		
		String str = "J 3 asdfasdf";
		System.out.println(str.replaceAll("\\s+",""));
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		
		System.out.println(timeStamp);*/
		
		
		/*try {

			ObjectMapper mapper = new ObjectMapper();
			String json = "";

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "mkyong");
			map.put("age", 29);

			// convert map to JSON string
			json = mapper.writeValueAsString(map);

			System.out.println("---------------"+json);

			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

			// pretty print
			System.out.println(json);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

}
