package com.hosp;

import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Hospital hospital = new Hospital();
		while(true) {
			System.out.println("1. Add Doctor");
			System.out.println("2. Add Patient");
			System.out.println("3. Assign Doctor to Patient");
			System.out.println("4. Exit");
			System.out.println("........................................");
			System.out.println("Enter  the Option");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1 :
				System.out.println("Enter the doctor name : ");
				String docName=sc.next();
				System.out.println("Enter the speacialization : ");
				String specialization = sc.next();
				
				Doctor doctor = new Doctor(docName,specialization);		
				hospital.addDoctor(doctor);
				break ;
				
			case 2 :
				System.out.println("Enter the patient name : ");
				String patName=sc.next();
				System.out.println("Enter the Age : ");
				int age  = sc.nextInt();
				System.out.println("Enter the Contact no : ");
				String contact=sc.next();
				
				Patient patient = new Patient(patName,age,contact);		
				hospital.addPatient(patient);
				break ;
				
			case 3:
				System.out.println("Select a Patient : ");
				 List<Patient> allPatients = hospital.getPatients();
				 for(int i=0;i<allPatients.size();i++) {
					 System.out.println((i+1)+"."+allPatients.get(i).getName());
				 }
				 
				 int patIndex = sc.nextInt()-1;
				 System.out.println("Select a Doctor : ");
				 List<Doctor> allDoctors = hospital.getDoctors();
				 for(int i=0;i<allDoctors.size();i++) {
					 System.out.println((i+1)+"."+allDoctors.get(i).getName());
				 }
				 
				 int docIndex = sc.nextInt()-1;  
				 
				 allPatients.get(patIndex).assignDoctor(allDoctors.get(docIndex));
				 
				 break;
				 
			case 4 :
				System.out.println("Exiting the application.");
				sc.close();
				return;
				
				default:
					System.out.println("Invalid option ! Please select a valid option .");

			}
		}

	}

}
