
import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		String fName,lName;
		double eSal;
		Scanner in=new Scanner(System.in);
		System.out.print("enter 1st employee's first name\n");
		fName=in.next();
		System.out.print("enter 1st employee's last name\n");
		lName=in.next();
		System.out.print("enter 1st employee's salary\n");
		eSal=in.nextDouble();
		e1.setfName(fName);
		e1.setlName(lName);
		e1.setSalary(eSal);
		System.out.print("The annual income of  "+e1.getfName()+e1.getlName());
		System.out.println(" is: "+12*e1.getSalary());
		System.out.println("The increased income is: "+1.1*12*e1.getSalary());
		System.out.print("enter 2nd employee's first name\n");
		fName=in.next();
		System.out.print("enter 2nd employee's last name\n");
		lName=in.next();
		System.out.print("enter 2nd employee's salary\n");
		eSal=in.nextDouble();
		e2.setfName(fName);
		e2.setlName(lName);
		e2.setSalary(eSal);
		System.out.print("The annual income of  "+e2.getfName()+e2.getlName());
		System.out.println(" is: "+12*e2.getSalary());
		System.out.println("The increased income is: "+1.1*12*e2.getSalary());
	}

}
