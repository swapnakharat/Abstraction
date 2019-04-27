
public class Demo1 extends Demo {
	String First_Name ="";
	
	Demo1(String FirstName, String LastName) {
		super(FirstName, LastName);
		this.First_Name= FirstName;
	}
	public String getName() 
	{
		return First_Name;
	}
	public static void main(String[] args) {
		Demo1 d2= new Demo1("swapna", "Balasaheb");
		String s1=d2.getName();
		String s2=d2.getFullName();
		
		System.out.println("FirstName is :" + s1 + " and FullName is :" + s2);
		
	}

}
