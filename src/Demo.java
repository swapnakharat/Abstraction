
public abstract class Demo {
	String FirstName="";
	String LastName="";
	Demo(String FirstName, String LastName )
	{
	this.FirstName=FirstName;
	this.LastName=LastName;
	}
	public abstract String getName();
	public String getFullName()
	{
		return FirstName+ LastName;
		
	}
}

