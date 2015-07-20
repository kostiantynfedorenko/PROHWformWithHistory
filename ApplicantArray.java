package com.gmail.fedorenko.kostia;

import java.util.ArrayList;

public class ApplicantArray {

	private static ApplicantArray singleton;
	private ArrayList<Applicant> list = new ArrayList<Applicant>();
	
	public static ApplicantArray getInstance() {
		if(singleton==null)
			singleton = new ApplicantArray();
		return singleton;
	}
	
	private ApplicantArray() {};
	
	public void add(Applicant a){
		list.add(a);
	}
	
	public String getStat(){
		int genStat = 0;
		int ukrainians = 0;
		int count = 0;

		for (Applicant s:list) {
			ukrainians = ukrainians + s.getCitizenship();
			genStat = genStat + s.getGender();
			count++;
		}
		return "Totall Male respondents: " + Integer.toString(genStat) + "; total Female respondents: " + Integer.toString(count-genStat) + "; total Ukrainians: " + Integer.toString(ukrainians) + "\n\r";
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for (Applicant s:list)
			sb.append(s.toString());
		
		return sb.toString();
	}
}
