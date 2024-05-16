package Bank;

public class Bank {
	private int id;
	private String name;
	private String email;
	private int balance;
	private Date db1;
	private static int count;
	
	static {
		count=100;
	}
	
	public void display_all() {
		System.out.println(id+" "+name+" "+email+" "+db1+" "+balance);
	}
	public String toString() {
		return "id:"+id+"  name:"+name+"  email:"+email+"  DOB:"+db1+"  balance:"+balance;
	}
	
	public Bank() {
//		System.out.println("Default constructor invoke");
		this.id=count;
		this.name="ram";
		this.email="ram@gmail.com";
		this.balance=10000;
		this.db1=new Date();
		count+=1;
	}
	public Bank(String name,String email,Date db1,int balance) {
		this.id=count;
		this.name=name;
		this.email=email;
		this.balance=balance;
		this.db1=db1;
//		System.out.println("Parameter constructor invoke");
		count+=1;
	}
	
	public void transfer(Bank tr,int money) {
		this.balance-=money;
		tr.balance+=money;
	}
	
	public int getId() {
		return id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	

	public String getname() {
		return this.name;
	}
	public String getemail() {
		return this.email;
	}
	public int getbalance() {
		return this.balance;
	}
}
