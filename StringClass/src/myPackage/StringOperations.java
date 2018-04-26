package myPackage;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Vivek";
String str1="";
int len=str.length();
for(int i=len-1;i>=0;i--)
{
  str1=str1+str.charAt(i);	

} System.out.print(str1);
System.out.println();



String str2="Hello";
String str3="Java";
String out="";

out=str2.concat(str3);
System.out.println(out);
out=str2+" "+str3;
System.out.println(out);

System.out.println("Hello"+" ".concat(str3));

//Compare string CompareTo returns int

String oneStr="Hello Java";
String twoStr="hello java";

int out1=oneStr.compareToIgnoreCase(twoStr);
//out=String(out1);

if(out1==0)
{
	System.out.println();
System.out.println("Compare to Ignore Case");

}
else
{
	System.out.println("not comparing");
}
	
	
}

	
}