
public class Patient {
	
	
	//Fields
	private String firstName,
				   middleName,
				   lastName,
				   streetAddress,
				   patientCity,
				   patientState,
				   patientZip,
				   phoneNum,
				   emergencyName,
				   emergencyPhone;
	

	
/*
 * No-arg Constructor sets all fields
 * 	to an empty string
 */
	
	public Patient() {
		
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		patientCity = "";
		patientState = "";
		patientZip = "";
		phoneNum = "";
		emergencyName = "";
		emergencyPhone = "";
		
	}
	
	/*
	 * 
	 * 	
	 */
	
	public Patient(String firstN, String middleN, String lastN) {
		
		firstName = firstN;
		middleName = middleN;
		lastName = lastN;

	}
	
	
	
	public Patient(String fN, String mN, String lN, String sA, String pC,
			String pS, String pZ, String pN, String eN, String eP) {
		
		firstName = fN;
		middleName = mN;
		lastName = lN;
		streetAddress = sA;
		patientCity = pC;
		patientState = pS;
		patientZip = pZ;
		phoneNum = pN;
		emergencyName = eN;
		emergencyPhone = eP;

	}
	
	
	//Methods
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	
	public String getPatientCity() {
		return patientCity;
	}
	
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	
	
	public String getPatientState() {
		return patientState;
	}
	
	public void setPatientState(String patientState) {
		this.patientState = patientState;
	}
	
	
	public String getPatientZip() {
		return patientZip;
	}
	
	public void setPatientZip(String patientZip) {
		this.patientZip = patientZip;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getEmergencyName() {
		return emergencyName;
	}
	
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}
	
	public String getEmergencyPhone() {
		return emergencyPhone;
	}
	
	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}
	

	public String buildFullName() {
		return (this.firstName + " " + this.middleName + " " + this.lastName);
	}
	
	public String buildAddress() {
		return (this.streetAddress + " " + this.patientCity + " " 
				+ this.patientState + " " + this.patientZip);
	}
	
	public String buildEmergencyContact() {
		return (this.emergencyName + " " + this.emergencyPhone);
	}
	
	public String toString() {
		return ("Patient Info: \n" +
				"\tName: " + buildFullName() + "\n" +
				"\tAddress: " + buildAddress() + "\n" +
				"\tEmergency Contact: " + buildEmergencyContact() + "\n");
	}

	
	
	
	
	
	
	
	
	
	

}
