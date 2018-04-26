package myPackage;

import java.io.IOException;

import org.jumpmind.symmetric.csv.CsvReader;
import org.jumpmind.symmetric.csv.CsvWriter;

public class Class1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//writing in csv
		
		CsvWriter writer=new CsvWriter("myCsv.csv");  //creation string
		String csvHeader[]= {"emp_id","name","salary"};
		writer.writeRecord(csvHeader);
		String csvRecord1[]= {"emp_001","vivek","10000"};
		writer.writeRecord(csvRecord1);
		String csvRecord2[]= {"emp_002","mudgal","20000"};
		writer.writeRecord(csvRecord2);
		writer.close();
		
		//Read from csv
		
		CsvReader reader=new CsvReader("myCsv.csv");
		while(reader.readRecord())
		{
			int count=reader.getColumnCount();
			for (int i=0;i<count;i++)
			{
				System.out.print(reader.get(i)+" ");
			
			}
			System.out.println();
		}
	}

}
