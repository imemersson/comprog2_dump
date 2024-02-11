public class SystemFlow {

	public static void main(String[] args) {
		
		empRecord empRec = new empRecord();
		empHoursWorked empHW = new empHoursWorked();
		empGrossSalary empGS = new empGrossSalary();
		empNetSalary empNS = new empNetSalary();

    /* you may observe the printf function, i used string formatting instead of concatenation*/
    /*the "\n" refers to next-line or enter*/
		System.out.printf("Employee ID: %d\nName: %s\nBirthday: %s\nContact: %d\n", empRec.id, empRec.name, empRec.birthday, empRec.contact);
		System.out.printf("Hours Worked: %f\n\n",empHW.hoursWorked);
		System.out.printf("Gross Salary: %d\n\n", empGS.empGrossSal);
		System.out.printf("Net Salary: %f", empNS.empNetSal);
	}

}


class empRecord {
	int id = 1;
	String name = "Manuell Garcia III";
	String birthday = "10-11-1983";
	int contact = 966860270;
}


class empHoursWorked {
	double hoursWorked = 45000/535.71;
}

class empGrossSalary {
	int empGrossSal = 45000; 
}

class empNetSalary {
	double deductions = 400+200+450; /* government deductions*/ 
	
	double empNetSal = 45000-deductions; 
}



