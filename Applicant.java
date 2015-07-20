package com.gmail.fedorenko.kostia;

public class Applicant {

	private String name;
	private String surname;
	private Integer gender;
	private Integer citizenship;

	public Applicant(String name, String surname, Integer gender,
			Integer citizenship) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.citizenship = citizenship;
	}
	@Override
	public String toString() {
		 return "<br>Name: " + this.name + " Surname: " + this.surname + " Gender: " + (this.gender == 1 ? " Male ": " Female ") + " Citizen: " +  (this.citizenship == 1 ? " Ukrainian ": " Foreinger ") + "</br>";
	}
	/**
	 * @return the gender
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * @return the citizenship
	 */
	public Integer getCitizenship() {
		return citizenship;
	}
	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(Integer citizenship) {
		this.citizenship = citizenship;
	}
	
	
	
	

}
