package Bank;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Bank arr[]=new Bank[10];	
		Scanner sc=new Scanner(System.in);
		int index=0;
		int a1=0;
		do {
			System.out.println("1.Add customer\n2.Display all customer details\n3.Deposit Money\n4.Withdraw Money\n5.Update email\n6.Transfer Money\n7.Quit");
			a1=sc.nextInt();
			switch(a1) {
			case 1:
				if (index<9) {
					System.out.println("Name,email,dob,balance");
					arr[index]=new Bank(sc.next(),sc.next(),new Date(sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.nextInt());
					System.out.println(arr[index]);
					index+=1;
				}
				break;
			case 2:
				for(int i=0;i<index;i++) {
					System.out.println(arr[i]);
				}
				break;
			case 3:
				System.out.println("Enter customer id and amount");
				int a2=sc.nextInt();
				int a3=sc.nextInt();
				for (int i=0;i<index;i++) {
					if(arr[i].getId()==a2) {
						int k=arr[i].getbalance();
						arr[i].setbalance(k+a3);
					}
				}
			case 4:
				System.out.println("Enter customer id and amount");
				int a4=sc.nextInt();
				int a5=sc.nextInt();
				for (int i=0;i<index;i++) {
					if(arr[i].getId()==a4) {
						int k=arr[i].getbalance();
						arr[i].setbalance(k-a5);
					}
				}	
			case 5:
				System.out.println("Enter customer id and updated email");
				int a6=sc.nextInt();
				String a7=sc.next();
				for(int i=0;i<index;i++) {
					if(arr[i].getId()==a6) {
						arr[i].setemail(a7);
					}
				}
			case 6:
				System.out.println("Enter Sender id , receiver id and amount");
				Bank b2=null;
				Bank b3=null;
				int a8=sc.nextInt();
				int a9=sc.nextInt();
				int a10=sc.nextInt();
				for (int i=0;i<index;i++) {
					if(arr[i].getId()==a8) {
						b2=arr[i];
					}
					if(arr[i].getId()==a9) {
						b3=arr[i];
					}
				}
				b2.transfer(b3, a10);
			}
			
			
			
		}while(a1!=7);
	}

}
