package myPackage;

import java.util.ArrayList;//test



import java.util.List;


public class ArrayListClass {

	public static void main(String[] args) throws IndexOutOfBoundsException{
		// TODO Auto-generated method stub
List <Object> ObjAl=new ArrayList<Object>();
ObjAl.add("string value");
ObjAl.add(100);
ObjAl.add(20.88);
ObjAl.add("@#$%");
System.out.println(ObjAl);
System.out.println("-----------------");
try 
{
	for(Object o:ObjAl)
	{
	System.out.println(o);	
	
	//testing git 
	}	
}
catch (IndexOutOfBoundsException bound)

{
System.out.println(bound.getMessage());	
}

try
{
ObjAl.add(5, "Vivek"); // 	IndexOutOfBoundsException

}
catch(Exception e)
{
System.out.println("Index not found");	
}

System.out.println("-----------------");
for(int i=0;i<=ObjAl.size();i++)
{
	try {
	
System.out.print(ObjAl.get(i)+" ");
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
	System.out.println();
}


}

}
