package com.hosp;

public class Doctor {
	
	
	private String speacialization;
	private String name;
	
	public Doctor(String name,String speacialization){
		this.name=name;
		this.speacialization=speacialization;
	}
	
	public String getName() {
		return name;
	}
   public String getSpeacialization() {
	   return speacialization;
   }
  
}
