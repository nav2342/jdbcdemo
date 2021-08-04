package jdbcdemo;
import java.util.*;
public class EmployeeCrud1 {
	public static void main(String[] args) {
			
			Employee1 e=new Employee1();
			String city=null,name=null,contactno=null;
			int cid=0;
			
			System.out.println("** Global Tech Solutions **");
			System.out.println("----------- Employee Management System ----------");
			while(true)
			{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5 for Exit"); 
				
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1: System.out.println("Enter Customer Name, City & Contact no :");
					
					name=sc.next();
					city=sc.next();
					contactno=sc.next();
					e.insertEmployee(name,city,contactno);
					break;
					
			case 2: e.getEmployee1();
					break;
					
			case 3: System.out.println("Enter Employee name & City to be Updated:");
			
			name=sc.next();
			city=sc.next();
					e.updateEmployee1(name,city);
					break;
					
			case 4: System.out.println("Enter Employee Name  to be Deleted:");
			name=sc.next();
					e.deleteEmployee1(name);
					break;
			case 5: System.out.println("Application Terminated");
	 				System.exit(0);

			default: System.out.println("Invalid Selection");
	          break;
	}

		}

		}

	}

