package payroll;
import java.util.*;
import java.sql.*;

public class System {
	String sel = "Select A: Existing site\n"
			+ "Select B: Add new site\n"
			+ "Select C: Delete existing site\n";
	private String select, sitee;
	private int number;
	Object employee [][] = new Object [number][4];
	int i = 0;
	
	System() {
		ArrayList<String> site = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		select = sc.next();
		
		if ((select == "A")||(select == "a")) {
			
		}
		else if ((select == "B")||(select == "b")) {
			Scanner si = new Scanner (System.in);
			System.out.println("Name of new site: ");
			sitee = si.next();
			site.add(sitee);
			System.out.println("Number of Employees?: ");
			Scanner no = new Scanner (System.in);
			number = no.nextInt();
			
			while (i<employee.length) {
				int ctr=0;
				
				System.out.println("Name: ");
				Scanner na = new Scanner (System.in);
				employee [i][ctr]=na.nextLine();
				
				ctr++;
				
				System.out.println("Birthdate: ");
				Scanner bd = new Scanner (System.in);
				employee[i][ctr]=bd.nextLine();
				
				ctr++;
				
				System.out.println("Age: ");
				Scanner ag = new scanner (System.in);
				employee[i][ctr]=ag.nextInt();
				
				ctr++;
				
				System.out.println("Rate: ");
				Scanner ra = new Scanner (System.in);
				employee[i][ctr]=ra.nextInt();
				
				i++;
				
			}
			
			
			
		}
		else if ((select == "C")||(select == "c")) {
	
		}	
		
	}
	

	
	

}
