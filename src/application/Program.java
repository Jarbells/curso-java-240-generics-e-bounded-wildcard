package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\in.txt"))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
 			}
			
			Product max = CalculationService.max(list);
			System.out.println("Most expensive product:");
			System.out.println(max);
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
