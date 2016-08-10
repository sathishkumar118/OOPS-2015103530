import java.util.Scanner;


public class Employee {
	private String firstName,lastName;
	private double eSalary;
	Scanner in=new Scanner(System.in);
	public Employee()
	{
		firstName=null;
		lastName=null;
		eSalary=0;
	}
	public void setfName(String fN)
	{
		firstName=fN;
	}
	public void setlName(String lN)
	{
		lastName=lN;
	}
	public void setSalary(double a)
	{
		eSalary=a;
		while(a<=0)
		{
			System.out.println("Enter positive salary");
			a=in.nextDouble();
			eSalary=a;
		}
	}
	public String getfName()
	{
		return firstName;
	}
	public String getlName()
	{
		return lastName;
	}
	public double getSalary()
	{
		return eSalary;
	}
	
	}
