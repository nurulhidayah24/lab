package exercise;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Rainfall {

public static void main(String[] args) {
		
		
		
		String rainFile = "rainfalldata1.txt";
		
		int stationID [] = {2421003,2322006,2324033,2225044,2223023,2222006 };
		String station[] = {"Simpang Ampat","Melaka Pindah","Hospital Jasin","Chohong","Sg. Duyong","Cheng (Taman Merdeka)"};
		String district[] = {"Alor Gajah","Alor Gajah", "Jasin","Jasin","Melaka Tengah","Melaka Tengah"};
		double dailyRainfall[][] = {{0.0, 4.0, 1.0, 0.0, 6.0, 19.0},{0.0,0.0,0.0,2.0,18.5,2.5},{0.0,14.0,0.0,11.0,15.0,31.0},{0.0,21.5,0.0,39.0,14.5,24.5},{0.0,3.0,0.0,43.0,26.0,26.0},{0.0,3.5,0.0,42.5,10.0,14.5}};
		
		try {
			
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(rainFile));
			
			
			
			for (int index = 0; index < stationID.length; index++) {
				
				// 3. Write data into data stream
				dos.writeInt(stationID[index]);
				dos.writeUTF(station[index]);
				dos.writeUTF(district[index]);
				dos.writeDouble(dailyRainfall[index][index]);
				
				
				dos.flush();
			}
			
			
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		
		System.out.println("End of program. Data has been created "); 
	}

}
