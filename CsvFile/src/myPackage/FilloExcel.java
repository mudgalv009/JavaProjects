package myPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloExcel {

	public static void main(String[] args) throws IOException, FilloException {
		// TODO Auto-generated method stub

		HSSFWorkbook bookObj=new HSSFWorkbook();
		bookObj.write(new File("myExceldb.xls"));
		
		Fillo fillo=new Fillo();
		Connection con=fillo.getConnection("myExceldb.xls");
		
		String colNames[]= {"emp_id", "emp_name", "salary"};
		con.createTable("Employee", colNames);
		
		//insert record
		
		String insertQry="insert into Employee(emp_id,emp_name,salary)values('emp_001','vivek','20000')";
		con.executeUpdate(insertQry);
		
		String insertQry1="insert into Employee(emp_id,emp_name,salary)values('emp_002','vivek mudgal','90000')";
		con.executeUpdate(insertQry1);
		
		//update record
		
		String updateQry="update Employee set emp_id='emp_009' where salary ='20000'";
		con.executeUpdate(updateQry);
		
		
		
		//select query
		
		String selectQry ="Select * from Employee";
		Recordset RS=con.executeQuery(selectQry);
		
		int count=0;
		while(RS.next())
		{
			count=RS.getCount();
			
			for(int i=0;i<count;i++)
			{
				System.out.println(RS.getField(i).value()+" ");
				
			}
			System.out.println();
		System.out.println(con.getMetaData().getTableNames());
		System.out.println();
		}
	}

}
