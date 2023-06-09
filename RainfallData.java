package exercise;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class RainfallData {

	public static void main(String[] args) {

		
		String sourceFile = "rainfalldata1.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			double dailyRainfall = 0;
			double totaldailyRainfall = 0;
			String station = "";
			String district = "";

			while(dis.available() > 0) {
				
				// Read data
				station = dis.readUTF();
				district = dis.readUTF();
				dailyRainfall = dis.readDouble();
				System.out.println( station + district + "\t" + dailyRainfall);
				
				// Calculate total 
				totaldailyRainfall += dailyRainfall;
				
			}
			
			
			dis.close();
			
			
			double averagedailyRainfall = totaldailyRainfall / 6;
			System.out.print("\nAverage daily rainfall for " + station + district 
					+ " days: " + averagedailyRainfall);
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		

	}

}
