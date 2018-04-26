package myPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set <String> HashObj=new HashSet<String>();
HashObj.add("String value");
HashObj.add("100");
HashObj.add("20.88");
HashObj.add("#$@$%");
HashObj.add("100");

System.out.println(HashObj);
System.out.println("-------------");
for(String str:HashObj)

System.out.println(str);	
System.out.println();

Iterator<String> itr=HashObj.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());	
}


	}

}
