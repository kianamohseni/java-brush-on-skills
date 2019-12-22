package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		// Insert your code here..
		HashMap<String, Double> myLine = new HashMap<String, Double>();
		System.out.println("lines.size(): " + lines.size());
		int line_number = 1;

		for(String line: lines) {
			String [] values = line.split(",");
			int i = 0;
			for (String value: values) {
				double dval = Double.parseDouble(value);
				myLine.put(headers.get(i), dval);
				i++;
			}
			System.out.println("myLine: " + myLine);
			dataResult.add(myLine);
			line_number++;	
		}
		System.out.println("line_number: " + line_number);

		return dataResult;
	}
	
	
}
