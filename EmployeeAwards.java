package CollectionsAssignment;
import java.util.*;
import java.util.Random;

public class EmployeeAwards {
	
		 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<String> employees = new LinkedList<String>();
		Random random = new Random();
		employees.add("Krisna");
		employees.add("Santosh");
		employees.add("Pradeep");
		employees.add("Dola");
		
		
		
		System.out.println("\t\t Welcome to Changepond Award wining employee on given month \n");
		
		for(;;)
		{
			System.out.println("Select option: \n");
			System.out.println("\t\t1. List of Employees \n");
			System.out.println("\t\t2. Display award wining employee upon entered month \n");
			System.out.println("\t\t3. Exit \n");
			System.out.println("choose your choice ");
			int choice = sc.nextInt();
			
			if(choice ==1) {
					System.out.println("list of empolyees");
					for(String employee:employees) {
						System.out.println(employee);
					}
					
			}
			else if(choice==2) {
				System.out.println("Enter a month :\n");
				String month=sc.next();
				int randomIndex = random.nextInt(employees.size());
				if(month.equals("jan")|| month.equals("feb")||month.equals("march")||month.equals("april")
						||month.equals("may")||month.equals("june")||month.equals("july")||month.equals("august")
						||month.equals("sept")||month.equals("oct")||month.equals("nov")||month.equals("dec")) {
					System.out.println(month + " Month award winner ==> " +employees.get(randomIndex)+"\n");
					
				}
				else {
					System.out.println("Invalid Month, check Month spelling...!!!!!");
				}
			
			}
				
			else if(choice ==3) {
				
				break;
			}
			else {
				System.out.println("Invalid choice");
				continue;
			}
		}
		
		
	   
	}

}
