package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyAccess {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
String url="jdbc:ucanaccess://D:/MyAccessDB.mdb";  //for MS access only

Connection conn=DriverManager.getConnection(url);
Statement st=conn.createStatement();
st.execute("create table Winter(winter_id varchar(10),winter_name varchar(20))");
for(int i=0;i<10;i++)
{
st.execute("insert into Winter values('emp001','Vivek')");
}

//select query

ResultSet rs=st.executeQuery("select * from Winters");

//Get metadata

System.out.println(rs.getMetaData().getColumnCount());
for(int j=0;j<=rs.getMetaData().getColumnCount();j++)
{
System.out.println(rs.getMetaData().getColumnName(j));
	}
	}
}
