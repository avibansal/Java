package Business;

public class Tester {
	public static void main(String[] args) {
		Employee e1=new Employee();		//It will call parameterized method
//		System.out.println(e1);// It will internally call to string
		
		Manager m1=new Manager();
//		System.out.println(m1);
		
		Sales s1=new Sales();
//		System.out.println(s1);
		
		Employee arr[]=new Employee[5];
		arr[0]=e1;
		System.out.println(arr[0]);
		arr[1]=m1;
		System.out.println(arr[1]);			//UPCASTING-> To store in variable of parent class for easy iteration 
		arr[2]=s1;
		System.out.println(arr[2]);			//UPCASTING
		
		((Employee)arr[1]).display();		//DOWNCASTING-> To use the method present in one of the sub-class
		
		if(arr[1] instanceof Employee){
			System.out.println("HELLO");
		}
	}
	
}
