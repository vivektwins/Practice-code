package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReadandWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader f= new FileReader("/Users/vivekkumar/Documents/logextract.csv - Sheet1.csv");
		
		BufferedReader br = new BufferedReader(f);
		
		
		String temp ="";
		
		while((temp=br.readLine())!=null)
		{
			
			String arr[]=temp.split(",");
			
					
			String input = "{\n"
					+ "    \"name\": \""+arr[0]+"\",\n"
					+ "    \"job\": \""+arr[1]+"\"\n"
					+ "}";
			
			
			
			System.out.println(input);
		}
		
//		FileWriter fw = new FileWriter("/Users/vivekkumar/Documents/names - Sheet1.csv");
//		BufferedWriter bw = new BufferedWriter(fw);
//		String temp1="";
//		bw.write("hi da sdjhfhshgfdshdfk");
//		bw.close();
//		
		
		
				

	}

}
