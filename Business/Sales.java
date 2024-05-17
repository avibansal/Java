package Business;

public class Sales extends Employee{
	private double bonus;

	public Sales() {
		super("Kavi",2000);
		this.bonus = 2500;	
	}

	public Sales(String empname, double empsalary) {
		super(empname, empsalary);
		this.bonus=bonus;
	}

	@Override
	public String toString() {
		return super.toString()+" Bonus " + bonus;
	}
	
	
}
