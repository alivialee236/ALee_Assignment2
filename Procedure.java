
public class Procedure {
	
	private String procedureName,
				   procedureDate,
				   practitionerName;
	private double procedureCharge;
	
	
	public Procedure() {
		
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		procedureCharge = 0;
		
	}
	
	public Procedure(String procedureName, String procedureDate) {
		
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;	
		
	}
	
	
	public Procedure(String procedureName, String procedureDate,
			String practitionerName, double procedureCharge) {
		
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;	
		this.practitionerName = practitionerName;
		this.procedureCharge = procedureCharge;
		
	}
	
	
	public String getProcedureName() {
		return procedureName;
	}
	
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	
	public String getPractitionerName() {
		return practitionerName;
	}
	
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	
	public double getProcedureCharge() {
		return procedureCharge;
	}
	
	public void setProcedureCharge(double procedureCharge) {
		this.procedureCharge = procedureCharge;
	}
	
	public String toString() {
		
		return ("\t\tProcedure: " + this.procedureName + "\n" +
				"\t\tProcedure Date= " + this.procedureDate + "\n" +
				"\t\tPractitioner= " + this.practitionerName + " \n" +
				"\t\tCharge= " + this.procedureCharge + "\n");
		
	}
	
	
	
}
