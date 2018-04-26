package myPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> MapObj=new HashMap<Integer, String>();

MapObj.put(1, "value1");
MapObj.put(2, "value2");
MapObj.put(3, " ");
MapObj.put(4, "value3");
MapObj.put(5, null);

MapObj.put(5, "value5");
MapObj.put(3, null);

System.out.println(MapObj);

System.out.println("--------------------------");
Set<Integer> setofkeys=MapObj.keySet();
for(Integer keys:setofkeys)
	System.out.print(keys);
System.out.println();
System.out.println("--------------------------");
System.out.println("Entry Set");
Set<Entry<Integer,String>>recordset=MapObj.entrySet();
for(Entry<Integer, String>entry:recordset)
	System.out.print(entry.getKey()+"="+entry.getValue()+" ");
System.out.println();

System.out.println("--------------------------");
for(int i=1;i<=MapObj.size();i++)
{
	System.out.print(MapObj.get(i)+" ");
}
System.out.println();
	}

}
