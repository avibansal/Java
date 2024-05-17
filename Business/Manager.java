package Business;

public class Manager extends Employee{	//Child class of Employee class(Hierarchical)
	private double bonus;


	public Manager(String empname, double empsalary, double bonus) {
		super(empname, empsalary);		//For initial the Parent attribute
		this.bonus = bonus;
	}


	public Manager() {
		super("Ravi", 1890);
		this.bonus=2000;
	}

	
	@Override
	public String toString() {
		return super.toString()+" Bonus:"+bonus;
	}
	
//	@Override
//	public String toString() {
//		return "Manager [bonus=" + bonus + "]";
//	}

	
	
	
}
