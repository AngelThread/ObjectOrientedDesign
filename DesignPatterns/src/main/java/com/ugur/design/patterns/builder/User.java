package com.ugur.design.patterns.builder;
// Example of Builder Pattern.
// This pattern is used when there are many constructor arguments that can be used while initialization.
public class User {
	
	private String userName; // Required
	private String password; // Required

	private String firstName; 	 // optional
	private String lastName;  	 // optional
	private String eMail;    	 // optional
	private String cellPhone;    // optional

	
	private User(Builder builder) {
		this.userName = builder.userName;
		this.password = builder.password;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.eMail = builder.eMail;
		this.cellPhone = builder.cellPhone;
	}

	@Override
	public String toString() {
		return "userName= "+userName+", firstName= "+ firstName + ", lastName= "
	+ lastName+", eMail= "+ eMail+ ", cellPhone= "+cellPhone;
	}
	
	public static class Builder{
		private String userName; // Required
		private String password; // Required

		private String firstName; 	 // optional
		private String lastName;  	 // optional
		private String eMail;    	 // optional
		private String cellPhone;    // optional
		
		
		public Builder(String userName, String password){
			this.userName  =userName;
			this.password = password;
		}
		
		public Builder firstName(String firstName){
			this.firstName = firstName;
			return  this;
		}
		
		public Builder lastName(String lastName){
			this.lastName = lastName;
			return  this;
		}
		public Builder eMail(String eMail){
			this.eMail = eMail;
			return  this;
		}
		public Builder cellPhone(String cellPhone){
			this.cellPhone = cellPhone;
			return  this;
		}
		
		public User buid(){
			return new User(this);
		}
	}
	

}
