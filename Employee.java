package Employee;

public class Employee {
String name;
int id;
double salary;
Employee(String name,int id, double salary)
{
	this.name = name;
	this.id = id;
	this.salary = salary;
}
void displaydetails() {
	System.out.println("Employee id: " + id);
	System.out.println("name: " + name);
	System.out.println("salary: " + salary);
	System.out.println("Employee details are");
}
void increasesalary(double percentage) {
	 double increment = (salary * percentage) / 100;
	 salary = salary + increment;
	 System.out.println(name + "'s salary increased by" + percentage + "%");	
}
}


