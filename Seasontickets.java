package CollectionsAssignment;

import java.util.*;

public class Seasontickets {

	public static void main(String[] args) {
		LinkedList<String> employees = new LinkedList<String>();
		Queue<String> allotedemp = new LinkedList<String>();
		Queue<String> waitlist = new LinkedList<String>();

		employees.add("satya");
		employees.add("pradeep");
		employees.add("muttu");
		employees.add("partha");
		employees.add("ulga");

		for (;;) {
			System.out.println("\nselect options");
			System.out.println("1.List of employees");
			System.out.println("2.Employees alloted to tickets");
			System.out.println("3.waiting list employees");
			System.out.println("4. Cancel Ticket and Exit \n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Select option:");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("************List of Employees**************\n");
				System.out.println(employees);
			} else if (choice == 2) {
				System.out.println("************Employees got tickets**************\n");
				System.out.println("Book ticket by name");
				String emp = sc.next();
				if (allotedemp.size() >= 0 && allotedemp.size() < 2) {
					if (employees.contains(emp)) {
						allotedemp.add(emp);
						System.out.println("Ticket booked successfully");
					} else {
						System.out.println(emp + "Employee does not matching with emoployees list");
					}

				} else {
					System.out.println("\nHousefull");
					System.out.println("Do you want to book a ticket in waiting list (y/n)");
					char c = sc.next().charAt(0);
					if (c == 'y' || c == 'Y') {
						System.out.println("Enter your name: ");
						String name = sc.next();
						if (employees.contains(name)) {
							waitlist.add(name);
							System.out.println("Added succesfully to waiting list");
						} else {
							System.out.println(name + "Name does not match with employees list ");
						}
					} else {
						System.out.println("Thank you");
					}
				}
			} else if (choice == 3) {
				System.out.println("************Employees in waiting list**************\n");
				System.out.println(waitlist);
			} else if (choice == 4) {
				System.out.println("Canceled tickets");
				System.out.println("Enter the name: ");
				String names = sc.next();
				if (allotedemp.contains(names)) {
					allotedemp.remove(names);
					allotedemp.add(waitlist.peek());
					waitlist.poll();
					System.out.println("Ticekt cancelled successfully");
					System.out.println(allotedemp);
				} else {
					System.out.println("name does not match in booked list");
				}
			} else {
				System.out.println("Invalid choice:  Do you want to continue(Y/N)");
				String con = sc.next();
				if (con.equals("y")) {
					continue;
				}
				break;
			}

		}
	}

}
