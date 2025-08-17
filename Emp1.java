package Employee;

public  class Emp1  {
public static void main(String[] args) {
	Employee emp2 = new Employee("Eli",101,50000);
	Employee emp3 = new Employee("Lily",102,45000);
	
	System.out.println ("Intial Employee details");
	emp2.displaydetails();
	emp3.displaydetails();
	
	
	emp2.increasesalary (10);
	emp3.increasesalary (5);
	
	System.out.println ("Updated Employee details:");
	emp2.displaydetails ();
	emp3.displaydetails ();
}
}

