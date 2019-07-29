package com.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = Integer.parseInt(br.readLine());                // Reading input from STDIN
        String numbers = br.readLine();
        String[] num = numbers.split(" ");
	    Integer[] intnumbers = new Integer[num.length];
	    int i=0;
	    for (String str:num) {
	    	intnumbers[i] = Integer.parseInt(str);
	    	i++;
	    }
	    
		System.out.println(totalNumbers);
		System.out.println(intnumbers);

		for (int j=0;j<intnumbers.length;j++) {
			int count = 1;
			while (count <= intnumbers[j]) {
				if (count % 3 == 0) {
					System.out.println("Fizz");
				} else if (count % 5 == 0) {
					System.out.println("Bizz");
				} else {
					System.out.println(count);
				}
				count++;
			}
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MapTest test = new MapTest();
		String code = "model-1";
		List<Car1> lis1 = Optional.ofNullable(test.getCarMoel()).filter(carModel -> carModel.containsKey(code))
				.map(carModel -> carModel.get(code)).orElse(new ArrayList<>());
		for (Car1 car1 : lis1) {
			System.out.println(car1.getModel() + "__________" + car1.getName());
		}
	}

	public Map<String, List<Car1>> getCarMoel() {
		List<Car1> list = new ArrayList<>();
		list.add(new Car1("Test1", "model-1"));
		list.add(new Car1("Test2", "model-2"));
		list.add(new Car1("Test3", "model-3"));
		list.add(new Car1("Test4", "model-1"));
		return list.stream().filter(Objects::nonNull).filter(obj -> obj.getModel() != null)
				.collect(Collectors.groupingBy(Car1::getModel, Collectors.mapping(i -> i, Collectors.toList())));
	}

}
