import java.util.*;

 public class Main
{
	public static void main(String[] args) {
		
		ArrayList<Employee1> c = new ArrayList<Employee1>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1. Insert/Add");
			System.out.println("2. Display");
			System.out.println("3. Search/Find");
			System.out.println("4. Delete");
			System.out.println("5. Update");
			System.out.println("Enter the Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Employee ID");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name");
				String Name = sc1.nextLine();
				System.out.println("Enter Employee Salary");
				int Salary = sc.nextInt();
				
				c.add(new Employee1(Name,id,Salary));
				break;
			
			case 2:
				System.out.println("---------------------------");
				Iterator<Employee1> i = c.iterator();
				while(i.hasNext())
				{
					Employee1 e = i.next();
					System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
				}
				System.out.println("---------------------------");
				break;
				
			case 3:
				boolean found = false;
				System.out.println("Enter ID to Search : ");
				 id = sc.nextInt();
				System.out.println("---------------------------");
				i = c.iterator();
				while(i.hasNext())
				{
					Employee1 e = i.next();
					if(e.getId()==id)
					{
					System.out.println(e);
					found = true;
					}
				}
				if(!found)
					System.out.println("Record not found");
				System.out.println("---------------------------");
				break;
				
			case 4:
				found = false;
				System.out.println("Enter ID to Delete : ");
				 id = sc.nextInt();
				System.out.println("---------------------------");
				i = c.iterator();
				while(i.hasNext())
				{
					Employee1 e = i.next();
					if(e.getId()==id)
					{
					i.remove();
					found = true;
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}	
				else 
				{
					System.out.println("Record is Successfully Deleted....");
				}
				System.out.println("---------------------------");
				break;
			
			
			
		case 5:
			found=false;
			System.out.println("Enter ID to update : ");
			 id = sc.nextInt();
			System.out.println("---------------------------");
			ListIterator<Employee1>li = c.listIterator();
			while(li.hasNext())
			{
				Employee1 e = li.next();
				if(e.getId()==id)
				{
				System.out.println("Enter the Name : ");
			String	name = sc1.nextLine();
			
			int salary = sc.nextInt();
				li.set(new Employee1(name,id,salary));
				found = true;
				}
			}
			if(!found)
			{
				System.out.println("Record not found");
			}	
			else 
			{
				System.out.println("Record is Successfully Updated....");
			}
			System.out.println("---------------------------");
			break;
		}	
		}
		while(choice!=0);
		sc.close();
		sc1.close();
		
		
	}
	}
