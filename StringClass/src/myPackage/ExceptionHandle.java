package myPackage;

@SuppressWarnings("serial")
public class ExceptionHandle extends Exception {
	@Override
	public String getMessage()
	{
		return "User defined message for exception handling";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int amount=9000;
try {
if(amount<10000)
{
throw new ExceptionHandle();	
}}
catch(ExceptionHandle e)
{
	System.out.println(e.getMessage());
}
	}

}
