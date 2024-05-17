package Business;

public class Employee {
	private int empid;
	private String empname;
	private double empsalary;
	private static int count;	//To generate Employee id
	
	static {					//Use to initialize Static variables which store in method area(will remain same for all instance)
		count=100;
	}
//Parameterized Constructor
	public Employee(String empname, double empsalary) {
		super();// For parent class
		this.empid = count;
		this.empname = empname;
		this.empsalary = empsalary;
		count+=1;
		//Will increment the counter after every allocation
	}
//Default Constructor
	public Employee() {
	this.empid=count;
	this.empname="Avi";
	this.empsalary=1000;
	count+=1;
}
	
	@Override		//Overriding:-Child class hides method of parent class
	//Here Parent class is Object and Object class have toString method which we are overriding
	//@Override is notation used to increase readability
	public String toString() {
		return "empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary ;
	}
	
	public void display() {
		System.out.println("Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]");
	}
	
	
	
}
