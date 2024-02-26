/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Assignment 2
 * Description: Develops a program consisting of three classes to display 
 * one instance of patient information, three instances
 * of procedure information and the total charges of the procedures.
 * Due: 2/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alivia Lee
*/



public class PatientDriverApp {

	public static void main(String[] args) {
		
		final String MY_NAME = "Alivia Lee",
					 MC_NUM = "M21117235",
					 DUE_DATE = "2/26/2024";
				
		double totalCharges = 0.00;
		
		
		Patient patient1 = new Patient("Alivia", "Boun", "Lee", "12345 New Court",
										"Citytown", "MD", "12345", "111-222-3333",
										"John Doe", "333-222-1111");
		Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr.Irvine", 3250.00);
		Procedure procedure2 = new Procedure("X-Ray", "7/20/2020", "Dr.Jamison", 5500.43);
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2021", "Dr.Smith", 1400.75);
		
		
		
		displayPatient(patient1);
		
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.println("Total Charges: $" + String.format("%,.2f", totalCharges) + "\n");
		
        System.out.println("This program was developed by: " + MY_NAME);
        System.out.println("MC #: " + MC_NUM);
        System.out.println("Due Date: " + DUE_DATE);
		
		
	}
	
	private static void displayPatient(Patient patient) {
		
		System.out.println(patient.toString());
		
	}
	
	private static void displayProcedure(Procedure procedure) {
		
		System.out.println(procedure.toString());
		
	}

	private static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		
		double totalCharges = 0.00;
		
		totalCharges = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
		
		return totalCharges;
		
	}
	
	
}
