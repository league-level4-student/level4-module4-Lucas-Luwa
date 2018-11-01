package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> listofpatients = new ArrayList<Patient>();

	public static void main(String[] args) {

	}

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient pat) {
		listofpatients.add(pat);
	}

	public ArrayList getPatients() {
		return listofpatients;
	}

	public void doMedicine() {
		for (int i = 0; i < listofpatients.size(); i++) {
			listofpatients.get(i).care = true;
			listofpatients.get(i).feelsCaredFor();
		}
	}
}
